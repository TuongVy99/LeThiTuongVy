package models;

import java.util.Date;

public class Customer{
    public String hoTen, gioiTinh, Email, loaiKhach, diaChi;
    public Date ngaySinh;
    public int soCMND, SĐT;

    public Customer(String hoTen, String gioiTinh, String email, String loaiKhach, String diaChi, Date ngaySinh, int soCMND, int SĐT) {
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.Email = email;
        this.loaiKhach = loaiKhach;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.soCMND = soCMND;
        this.SĐT = SĐT;
    }

    public Customer(String hoTen, String gioiTinh, int soCMND, String diaChi, int sđt, String email, String loaiKhach) {
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getLoaiKhach() {
        return loaiKhach;
    }

    public void setLoaiKhach(String loaiKhach) {
        this.loaiKhach = loaiKhach;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(int soCMND) {
        this.soCMND = soCMND;
    }

    public int getSĐT() {
        return SĐT;
    }

    public void setSĐT(int SĐT) {
        this.SĐT = SĐT;
    }
}
