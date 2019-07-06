package com.example.lenovo.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.List;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */

public class ProductService extends SQLiteHelper implements IAbstractService<Product>{

    private Context mContext;


    public ProductService(Context context) {
        super(context);
        this.mContext = context;
    }


    @Override
    public List<Product> findAll(int page, int limit) {
        return null;
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product findOne(Long id) {
        return null;
    }

    @Override
    public Product onSave(Product entity) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("name_en",entity.getNameEn());
        contentValues.put("name_kh",entity.getNameKh());
        contentValues.put("desc_en",entity.getDescEn());
        contentValues.put("desc_kh",entity.getDescKh());
        contentValues.put("created_date",entity.getCreatedDate().toString());
        contentValues.put("updated_date",entity.getUpdatedDate().toString());
        contentValues.put("status",entity.isStatus());
        contentValues.put("price",entity.getPrice());
        SQLiteDatabase database = SQLiteHelper.getInstance(mContext).getWritableDatabase();
        Long id  = database.insert("tbl_products",null,contentValues);
        Log.d("ID " , id.toString());

        Log.d("getPath " , database.getPath());
        Log.d("getVersion " , String.valueOf(database.getVersion()));
        return null;
    }

    @Override
    public Product onUpdate(Product entity, Long id) {
        return null;
    }

    @Override
    public Product onDelete(Long id) {
        return null;
    }

    @Override
    public boolean isExisting(Long id) {
        return false;
    }
}
