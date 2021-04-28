package models;

public class House extends Services {
    public String moTaTienNghiKhac, tieuChuanPhong;
    public int soTang;

    public House(String tenDichVu, String soLuongNguoiToiDa, int dienTichSuDung, String kieuThue, double chiPhiThue, String moTaTienNghiKhac, String tieuChuanPhong, int soTang) {
        super(tenDichVu, soLuongNguoiToiDa, dienTichSuDung, kieuThue, chiPhiThue);
        this.moTaTienNghiKhac = moTaTienNghiKhac;
        this.tieuChuanPhong = tieuChuanPhong;
        this.soTang = soTang;
    }

    public String getMoTaTienNghiKhac() {
        return moTaTienNghiKhac;
    }

    public void setMoTaTienNghiKhac(String moTaTienNghiKhac) {
        this.moTaTienNghiKhac = moTaTienNghiKhac;
    }

    public String getTieuChuanPhong() {
        return tieuChuanPhong;
    }

    public void setTieuChuanPhong(String tieuChuanPhong) {
        this.tieuChuanPhong = tieuChuanPhong;
    }

    public int getSoTang() {
        return soTang;
    }

    public void setSoTang(int soTang) {
        this.soTang = soTang;
    }

    @Override
    public String showInfor() {
        return super.showInfor()+"Tiêu chuẩn phòng:" +tieuChuanPhong+"Mô tả tiện nghi khác:" +moTaTienNghiKhac+"Số tầng:" +soTang;
    }
}
