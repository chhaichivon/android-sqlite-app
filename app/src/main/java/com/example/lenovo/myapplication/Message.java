package com.example.lenovo.myapplication;

import android.content.Context;
import android.widget.Toast;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */
public class Message {

    public static void message(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_LONG).show();
    }
}
