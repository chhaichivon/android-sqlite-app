package com.example.lenovo.myapplication;

import android.content.Context;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */

public class SQLiteAdapter  {

    public static SQLiteHelper  sqLiteHelper;

    public SQLiteAdapter(Context context) {
        this.sqLiteHelper = new SQLiteHelper(context);
    }
}
