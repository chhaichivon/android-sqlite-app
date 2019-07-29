package com.example.lenovo.myapplication;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: Chhai Chivon on 7/6/2019
 * Mobile Developer
 */
public abstract class AbstractEntity implements Serializable {

    public Long id;
    public String nameEn;
    public String nameKh;
    public String descEn;
    public String descKh;
    public String createdDate;
    public String updatedDate;
    public boolean status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameEn() {
        return nameEn;
    }

    public void setNameEn(String nameEn) {
        this.nameEn = nameEn;
    }

    public String getNameKh() {
        return nameKh;
    }

    public void setNameKh(String nameKh) {
        this.nameKh = nameKh;
    }

    public String getDescEn() {
        return descEn;
    }

    public void setDescEn(String descEn) {
        this.descEn = descEn;
    }

    public String getDescKh() {
        return descKh;
    }

    public void setDescKh(String descKh) {
        this.descKh = descKh;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    public String getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
