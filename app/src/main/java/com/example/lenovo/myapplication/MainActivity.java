package com.example.lenovo.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends Activity {

    private Cursor mCursor;
    private SQLiteHelper mDatabaseHelper;


//    @BindView(R.id.btn_category)
     Button mCategoryButton;
//    @BindView(R.id.btn_product)
//    Button mProductButton;
//    @BindView(R.id.btn_order)
//    Button mOrderButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

        //SQLiteDatabase sqLiteDatabase = mDatabaseHelper.getReadableDatabase();
        //mCursor = sqLiteDatabase.rawQuery("SELECT * FROM tb_products",null);
        SQLiteHelper.getInstance(getApplicationContext()).getWritableDatabase();

        /*ProductService productService  = new ProductService(getApplicationContext());

        for (int i = 0 ; i< 20 ; i++){
            Product product = new Product();
            product.setNameEn("name en "+i);
            product.setNameKh("name kh "+i);
            product.setDescEn("desc en "+i);
            product.setDescKh("desc kh "+i);
            product.setCreatedDate(new Date());
            product.setUpdatedDate(new Date());
            product.setStatus(Boolean.TRUE);
            product.setPrice(1.2f);
            productService.onSave(product);
        }*/
        //Message.message(getApplicationContext(),"Enter Both Name and Password");


        mCategoryButton = findViewById(R.id.btn_category);
        mCategoryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),CategoryActivity.class);
                startActivity(intent);
            }
        });


    }

    @OnClick(R.id.btn_category)
    public void onCategoryButtonClick(Button button){
        Intent intent = new Intent(getApplicationContext(),CategoryActivity.class);
        startActivity(intent);
    }

    @OnClick(R.id.btn_product)
    public void onProductButtonClick(View view){
        startActivity(new Intent(getApplicationContext(),ProductActivity.class));
    }

}
