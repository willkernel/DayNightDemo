package com.willkernel.app.daynightdemo;

import android.content.Intent;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDelegate;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainAty";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setNightMode();
            }

            private void setNightMode() {
                //获取当前模式
                int nightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
                Log.e(TAG, "mode=" + nightMode);

                //切换模式
                AppCompatDelegate.setDefaultNightMode(nightMode == Configuration.UI_MODE_NIGHT_NO ?
                        AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
                UserInfoTools.setNightMode(MainActivity.this, nightMode == Configuration.UI_MODE_NIGHT_YES);

                //recreate
//                1. MainActivity.this.recreate(); //闪屏bug

                startActivity(new Intent(MainActivity.this,MainActivity.class));
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                finish();

            }
        });
    }
}
