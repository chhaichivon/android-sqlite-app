package com.example.lenovo.myapplication;

import android.app.Activity;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends Activity implements Button.OnClickListener {

    private Cursor mCursor;
    private SQLiteHelper mDatabaseHelper;


    @BindView(R.id.btn_category)
    Button mCategoryButton;
    @BindView(R.id.btn_product)
    Button mProductButton;
    @BindView(R.id.btn_order)
    Button mOrderButton;

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
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {

            case R.id.btn_category:
                break;

            case R.id.btn_product:
                break;

            case R.id.btn_order:
                break;

            default:
                // code block
        }
    }
}
