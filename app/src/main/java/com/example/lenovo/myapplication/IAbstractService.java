package com.example.lenovo.myapplication;

import java.util.List;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */
public interface IAbstractService<T> {

    List<T> findAll(int page, int limit);

    List<T> findAll();

    T findOne(Long id);

    T onSave(T entity);

    T onUpdate(T entity, Long id);

    T onDelete(Long  id);

    boolean isExisting(Long id);
 }
