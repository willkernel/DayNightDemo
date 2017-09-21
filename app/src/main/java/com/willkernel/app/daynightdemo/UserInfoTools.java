package com.willkernel.app.daynightdemo;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by willkernel
 * on 2017/9/21.
 */

class UserInfoTools {
    private static final String name = "UserInfo";
    private static final String NIGHT_MODE = "night_mode";

    public static void setNightMode(Context context, boolean is) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(NIGHT_MODE, is);
    }

    public static boolean isNightMode(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(name, Context.MODE_PRIVATE);
        return sharedPreferences.getBoolean(NIGHT_MODE, false);
    }

    public static void setChangeNightMode(Context context, boolean b) {

    }
}
