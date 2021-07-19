package com.example.tinhtiennha;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class price {
    @PrimaryKey
    public int uid;
    private int elecbfnum;
    private int waterbfnum;
    private String tenphong;
    private int month;

    public price(int elecbfnum, int waterbfnum, String tenphong, int month) {
        this.elecbfnum = elecbfnum;
        this.waterbfnum = waterbfnum;
        this.tenphong = tenphong;
        this.month = month;
    }
    public int getElecbfnum() {
        return elecbfnum;
    }

    public void setElecbfnum(int elecbfnum) {
        this.elecbfnum = elecbfnum;
    }

    public int getWaterbfnum() {
        return waterbfnum;
    }

    public void setWaterbfnum(int waterbfnum) {
        this.waterbfnum = waterbfnum;
    }

    public String getTenphong() {
        return tenphong;
    }

    public void setTenphong(String tenphong) {
        this.tenphong = tenphong;
    }

    public int getDate() {
        return month;
    }

    public void setDate(int date) {
        this.month = date;
    }


}
