package com.example.lenovo.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */
public class CategoryService extends SQLiteAdapter implements IAbstractService<Category> {

    private Context mContext;

    public CategoryService(Context context) {
        super(context);
        this.mContext  = context;
    }

    @Override
    public List<Category> findAll(int page, int limit) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        List<Category> categories = new ArrayList<>();
        String query = "SELECT * FROM tbl_categories";
        SQLiteDatabase database = SQLiteHelper.getInstance(mContext).getWritableDatabase();
        Cursor cursor = database.rawQuery(query, null);
        if (cursor.moveToFirst()) {
            do {
                Category category = new Category();
                category.setId(cursor.getLong(cursor.getColumnIndex("id")));
                category.setNameEn(cursor.getString(cursor.getColumnIndex("name_en")));
                category.setNameKh(cursor.getString(cursor.getColumnIndex("name_kh")));
                category.setDescEn(cursor.getString(cursor.getColumnIndex("desc_en")));
                category.setDescKh(cursor.getString(cursor.getColumnIndex("desc_kh")));
                category.setCreatedDate(cursor.getString(cursor.getColumnIndexOrThrow("created_date")));
                category.setUpdatedDate(cursor.getString(cursor.getColumnIndexOrThrow("updated_date")));
                category.setStatus(cursor.getString(cursor.getColumnIndexOrThrow("name_en")).equals(1) ? Boolean.TRUE : Boolean.FALSE);
                categories.add(category);
            } while (cursor.moveToNext());
        }
        return categories;
    }

    @Override
    public Category findOne(Long id) {
        String query = "SELECT * FROM tbl_categories WHERE id = "+id;
        SQLiteDatabase database = SQLiteHelper.getInstance(mContext).getWritableDatabase();
        Cursor cursor = database.rawQuery(query, null);
        if(cursor != null){
            if(cursor.moveToFirst()){
                Category category = new Category();
                category.setId(cursor.getLong(cursor.getColumnIndex("id")));
                category.setNameEn(cursor.getString(cursor.getColumnIndex("name_en")));
                category.setNameKh(cursor.getString(cursor.getColumnIndex("name_kh")));
                category.setDescEn(cursor.getString(cursor.getColumnIndex("desc_en")));
                category.setDescKh(cursor.getString(cursor.getColumnIndex("desc_kh")));
                category.setCreatedDate(cursor.getString(cursor.getColumnIndexOrThrow("created_date")));
                category.setUpdatedDate(cursor.getString(cursor.getColumnIndexOrThrow("updated_date")));
                category.setStatus(cursor.getString(cursor.getColumnIndexOrThrow("name_en")).equals(1) ? Boolean.TRUE : Boolean.FALSE);
                return category;
            }
        }

        return null;
    }

    @Override
    public Category onSave(Category entity) {

        ContentValues contentValues = new ContentValues();
        contentValues.put("name_en",entity.getNameEn());
        contentValues.put("name_kh",entity.getNameKh());
        contentValues.put("desc_en",entity.getDescEn());
        contentValues.put("desc_kh",entity.getDescKh());
        contentValues.put("created_date",entity.getCreatedDate());
        contentValues.put("updated_date",entity.getUpdatedDate());
        contentValues.put("status",entity.isStatus());
        SQLiteDatabase database = SQLiteHelper.getInstance(mContext).getWritableDatabase();
        Long id  = database.insert("tbl_categories",null,contentValues);
        Category category  = findOne(id);
        return category;
    }

    @Override
    public Category onUpdate(Category entity, Long id) {

        return null;
    }

    @Override
    public Category onDelete(Long id) {
        return null;
    }

    @Override
    public boolean isExisting(Long id) {
        return false;
    }
}
