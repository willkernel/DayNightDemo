package com.willkernel.app.daynightdemo;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

/**
 * Created by willkernel
 * on 2017/9/21.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        setNightMode();
    }

    public void setNightMode() {
        boolean isNightMode = UserInfoTools.isNightMode(this);
        AppCompatDelegate.setDefaultNightMode(isNightMode ?
                AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
    }
}
