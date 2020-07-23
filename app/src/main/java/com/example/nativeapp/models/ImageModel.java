package com.example.nativeapp.models;

import java.io.Serializable;

public class ImageModel implements Serializable {
    private int soluong;
    private int idHinh;

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public int getIdHinh() {
        return idHinh;
    }

    public void setIdHinh(int idHinh) {
        this.idHinh = idHinh;
    }

    public ImageModel(int soluong, int idHinh) {
        this.soluong = soluong;
        this.idHinh = idHinh;
    }
}
