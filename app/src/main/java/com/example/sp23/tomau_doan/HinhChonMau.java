package com.example.sp23.tomau_doan;

public class HinhChonMau {
    private String ten;
    private String hinh;

    public String getTen() {
        return ten;
    }

    public String getHinh() {
        return hinh;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public HinhChonMau(String ten, String hinh) {
        this.ten = ten;
        this.hinh = hinh;
    }
}
