package com.example.lenovo.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.util.logging.Logger;

/**
 * @author: Chhai Chivon on 7/5/2019
 * Mobile Developer
 */

public class SQLiteHelper extends SQLiteOpenHelper implements IDatabaseTable {

    private static final String DATABASE_NAME = "SQLiteDB.db";
    private static final int DATABASE_VERSION = 1;
    private static String DATABASE_PATH = "/data/data/com.example.lenovo.myapplication/databases/"+DATABASE_NAME;
    private final Context mContext;
    private static SQLiteHelper sqLiteHelper;
    public SQLiteHelper(Context context) {

        super(context, DATABASE_PATH, null, DATABASE_VERSION);
//        if (android.os.Build.VERSION.SDK_INT >= 17)
//            DATABASE_PATH = context.getApplicationInfo().dataDir + "/databases/";
//        else
            //DATABASE_PATH = "/data/data/" + context.getPackageName() + "/databases/"+DATABASE_NAME;
        this.mContext = context;
        getWritableDatabase();
        //this.getReadableDatabase();
    }

    public static synchronized SQLiteHelper getInstance(Context context){
        if(sqLiteHelper == null){
            sqLiteHelper = new SQLiteHelper(context);
        }
        return sqLiteHelper;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        try {
            Log.d("Create tbl Product: " , tblProduct);
            Log.d("Create tbl Category: " , tblCategory);
            Log.d("Create tbl Order: " , tblOrder);

            db.execSQL(tblProduct);
            db.execSQL(tblCategory);
            db.execSQL(tblOrder);

            Log.d("End Create tblProduct:",tblProduct);
            Log.d("End Create tblCategory:",tblCategory);
            Log.d("End Create tblOrder:" , tblOrder);

        } catch (Exception e) {
            Message.message(mContext,"Exception "+e);
        }
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        try {
            Message.message(mContext,"OnUpgrade");
            db.execSQL(DROP_TABLE_CATEGORIES);
            db.execSQL(DROP_TABLE_PRODUCTS);
            db.execSQL(DROP_TABLE_ORDERS);
            //onCreate(db);
        }catch (Exception e) {
            Message.message(mContext,""+e);
        }
    }


    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
    }
}
