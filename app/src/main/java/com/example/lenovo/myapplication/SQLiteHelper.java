package com.example.lenovo.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * @author: Chhai Chivon on 7/5/2019
 * Mobile Developer
 */

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "SQLiteDB.db";
    private static final int DATABASE_VERSION = 1;
    private static String DATABASE_PATH = "";
    private final Context mContext;

    public SQLiteHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        if (android.os.Build.VERSION.SDK_INT >= 17)
            DATABASE_PATH = context.getApplicationInfo().dataDir + "/databases/";
        else
            DATABASE_PATH = "/data/data/" + context.getPackageName() + "/databases/";
        this.mContext = context;
        this.getReadableDatabase();
    }

    public void onCreate(SQLiteDatabase db) {
    }

    public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
    }

    
}
