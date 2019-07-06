package com.example.lenovo.myapplication;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */
public interface IDatabaseTable {

    String tblCategory = "CREATE TABLE tbl_categories (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "name_en TEXT," +
                        "name_kh TEXT," +
                        "desc_en INTEGER," +
                        "desc_kh TEXT," +
                        "created_date NUMERIC," +
                        "updated_date NUMERIC," +
                        "status TEXT )";

    String tblProduct = "CREATE TABLE tbl_products (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "name_en TEXT," +
                        "name_kh TEXT," +
                        "desc_en INTEGER," +
                        "desc_kh TEXT," +
                        "price INTEGER," +
                        "created_date NUMERIC," +
                        "updated_date NUMERIC," +
                        "status TEXT )";

    String tblOrder =  "CREATE TABLE tbl_orders (" +
                        "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                        "created_date NUMERIC," +
                        "updated_date NUMERIC," +
                        "status TEXT )";

    String DROP_TABLE_CATEGORIES = "DROP TABLE IF EXISTS tbl_categories";
    String DROP_TABLE_PRODUCTS = "DROP TABLE IF EXISTS tbl_products";
    String DROP_TABLE_ORDERS = "DROP TABLE IF EXISTS tbl_orders";

}
