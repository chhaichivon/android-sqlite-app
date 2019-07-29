package com.example.lenovo.myapplication;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.Date;
import java.util.List;

public class CategoryActivity extends Activity {


    private EditText mNameEnEditText, mNameKhEditText, mDescEnEditText, mDescKhEditText;
    private Button mSaveCategoryButton, mResetCategoryButton,mViewCategoryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        mNameEnEditText = findViewById(R.id.name_en_et);
        mNameKhEditText = findViewById(R.id.name_kh_et);
        mDescEnEditText = findViewById(R.id.desc_en_et);
        mDescKhEditText = findViewById(R.id.desc_kh_et);

        mSaveCategoryButton = findViewById(R.id.save_category_btn);
        mResetCategoryButton = findViewById(R.id.reset_category_btn);
        mViewCategoryButton = findViewById(R.id.view_category_btn);

        SQLiteHelper.getInstance(getApplicationContext()).getWritableDatabase();

        final CategoryService categoryService  = new CategoryService(getApplicationContext());

        mSaveCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Category category = getCategory();
                categoryService.onSave(category);
            }
        });

        mResetCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onResetCategory();
            }
        });

        mViewCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onViewCategory();
            }
        });

        List<Category> categories  = categoryService.findAll();
        for (Category category  : categories){
            Log.d("Name en",category.getNameEn());
            Log.d("Name kh",category.getNameEn());
            Log.d("Desc en",category.getNameEn());
            Log.d("Desc kh",category.getNameEn());
        }

    }

    private Category getCategory(){
        Category category = new Category();
        category.setNameEn(mNameEnEditText.getText().toString());
        category.setNameKh(mNameKhEditText.getText().toString());
        category.setDescEn(mDescEnEditText.getText().toString());
        category.setDescKh(mDescKhEditText.getText().toString());
        category.setCreatedDate(new Date().toString());
        category.setUpdatedDate(new Date().toString());
        category.setStatus(Boolean.TRUE);
        return category;
    }


    private void onResetCategory(){
        mNameEnEditText.setText("");
        mNameKhEditText.setText("");
        mDescEnEditText.setText("");
        mDescKhEditText.setText("");
    }

    private void onViewCategory(){

        AlertDialog.Builder dlgAlert  = new AlertDialog.Builder(this);
        dlgAlert.setMessage("This is an alert with no consequence");
        dlgAlert.setTitle("App Title");
        //dlgAlert.setPositiveButton("OK", null);
        dlgAlert.setCancelable(true);
        dlgAlert.create().show();

        //Intent  intent = new Intent(getApplicationContext(),ViewCategoryActivity.class);
        //startActivity(intent);
    }
}
