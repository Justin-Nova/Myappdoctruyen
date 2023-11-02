package com.example.myappdoctruyen.model;

public class TaiKhoan {

    // Các biến
    private int mId;
    private String mTenTaoKhoan;
    private String mMatKhau;
    private String mEmail;
    private int mPhanQuyen;

    //  Hàm khởi tạo
    public TaiKhoan(String mTenTaoKhoan, String mMatKhau, String mEmail, int mPhanQuyen) {
        this.mTenTaoKhoan = mTenTaoKhoan;
        this.mMatKhau = mMatKhau;
        this.mEmail = mEmail;
        this.mPhanQuyen = mPhanQuyen;
    }

    public TaiKhoan(String mTenTaoKhoan, String mEmail) {
        this.mTenTaoKhoan = mTenTaoKhoan;
        this.mEmail = mEmail;
    }

    // Các getter và setter
    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTenTaoKhoan() {
        return mTenTaoKhoan;
    }

    public void setmTenTaoKhoan(String mTenTaoKhoan) {
        this.mTenTaoKhoan = mTenTaoKhoan;
    }

    public String getmMatKhau() {
        return mMatKhau;
    }

    public void setmMatKhau(String mMatKhau) {
        this.mMatKhau = mMatKhau;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public int getmPhanQuyen() {
        return mPhanQuyen;
    }

    public void setmPhanQuyen(int mPhanQuyen) {
        this.mPhanQuyen = mPhanQuyen;
    }
}
