package com.example.lenovo.myapplication;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;

public class MainActivity extends Activity {

    private Cursor mCursor;
    private SQLiteHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SQLiteDatabase sqLiteDatabase = mDatabaseHelper.getReadableDatabase();
        mCursor = sqLiteDatabase.rawQuery("SELECT * FROM tb_products",null);

    }
}
