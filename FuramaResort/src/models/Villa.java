package models;

public class Villa extends Services{
    public String tieuChuanPhong, moTaTienNghiKhac;
    public int dienTichHoBoi, soTang;

    public Villa(String tenDichVu, String soLuongNguoiToiDa, int dienTichSuDung, String kieuThue, double chiPhiThue, String tieuChuanPhong, String moTaTienNghiKhac, int dienTichHoBoi, int soTang) {
        super(tenDichVu, soLuongNguoiToiDa, dienTichSuDung, kieuThue, chiPhiThue);
        this.tieuChuanPhong = tieuChuanPhong;
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.dienTichHoBoi = dienTichHoBoi;
        this.soTang = soTang;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public int getDienTichHoBoi() {
        return dienTichHoBoi;
    }

    public void setDienTichHoBoi(int dienTichHoBoi) {
        this.dienTichHoBoi = dienTichHoBoi;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return super.showInfor()+"Tiêu chuẩn phòng:" +tieuChuanPhong+"Mô tả tiện nghi khác:" +moTaTienNghiKhac+"Diện tích hồ bơi:" +dienTichHoBoi+"Số tầng:"+soTang;
    }
}
