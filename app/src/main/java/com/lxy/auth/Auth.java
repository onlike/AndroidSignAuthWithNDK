package com.lxy.auth;

import android.content.Context;

/**
 * author: lxy
 * created on: 2020/10/21 2:35 PM
 */
public class Auth {

    static {
        System.loadLibrary("gifprompt");
    }

    public static native String getAuthKey(Context var0);

}
