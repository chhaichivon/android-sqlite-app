package com.example.lenovo.myapplication;

import android.content.Context;

import java.util.List;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */
public class CategoryService extends SQLiteAdapter implements IAbstractService<Category> {

    public CategoryService(Context context) {
        super(context);
    }

    @Override
    public List<Category> findAll(int page, int limit) {
        return null;
    }

    @Override
    public List<Category> findAll() {
        return null;
    }

    @Override
    public Category findOne(Long id) {
        return null;
    }

    @Override
    public Category onSave(Category entity) {
        return null;
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
