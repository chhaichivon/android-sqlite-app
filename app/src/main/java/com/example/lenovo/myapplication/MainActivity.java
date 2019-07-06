package com.example.lenovo.myapplication;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;

import java.util.Date;

public class MainActivity extends Activity {

    private Cursor mCursor;
    private SQLiteHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //SQLiteDatabase sqLiteDatabase = mDatabaseHelper.getReadableDatabase();
        //mCursor = sqLiteDatabase.rawQuery("SELECT * FROM tb_products",null);
        SQLiteHelper.getInstance(getApplicationContext()).getWritableDatabase();

        ProductService productService  = new ProductService(getApplicationContext());
        Product product = new Product();
        product.setNameEn("name en");
        product.setNameKh("name kh");
        product.setDescEn("desc en");
        product.setDescKh("desc kh");
        product.setCreatedDate(new Date());
        product.setUpdatedDate(new Date());
        product.setStatus(Boolean.TRUE);
        product.setPrice(1.2f);
        productService.onSave(product);
        //Message.message(getApplicationContext(),"Enter Both Name and Password");
    }
}
