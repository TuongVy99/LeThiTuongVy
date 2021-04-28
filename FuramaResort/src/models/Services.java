package models;

public abstract class Services {
    public String tenDichVu, soLuongNguoiToiDa, kieuThue;
    public int dienTichSuDung;
    public double chiPhiThue;

    public Services(String tenDichVu, String soLuongNguoiToiDa, int dienTichSuDung, String kieuThue, double chiPhiThue) {
        this.tenDichVu = tenDichVu;
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
        this.dienTichSuDung = dienTichSuDung;
        this.kieuThue = kieuThue;
        this.chiPhiThue = chiPhiThue;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public String getSoLuongNguoiToiDa() {
        return soLuongNguoiToiDa;
    }

    public void setSoLuongNguoiToiDa(String soLuongNguoiToiDa) {
        this.soLuongNguoiToiDa = soLuongNguoiToiDa;
    }

    public int getDienTichSuDung() {
        return dienTichSuDung;
    }

    public void setDienTichSuDung(int dienTichSuDung) {
        this.dienTichSuDung = dienTichSuDung;
    }

    public String getKieuThue() {
        return kieuThue;
    }

    public void setKieuThue(String kieuThue) {
        this.kieuThue = kieuThue;
    }

    public double getChiPhiThue() {
        return chiPhiThue;
    }

    public void setChiPhiThue(double chiPhiThue) {
        this.chiPhiThue = chiPhiThue;
    }

    public String showInfor() {
        return "Services{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", soLuongNguoiToiDa='" + soLuongNguoiToiDa + '\'' +
                ", dienTichSuDung=" + dienTichSuDung +
                ", kieuThue=" + kieuThue +
                ", chiPhiThue=" + chiPhiThue +
                '}';
    }
}
