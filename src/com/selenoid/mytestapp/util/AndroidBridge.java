package com.selenoid.mytestapp.util;

import android.util.Log;

import com.selenoid.mytestapp.MainActivity;

public class AndroidBridge {

    private MainActivity activity;

    public AndroidBridge(MainActivity activity) {
        this.activity = activity;
    }
    
    public void test(String message) throws NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
    	Log.d("myApp", "\nmsg:"+message);
        activity.changeText(message);
    }

}
