package models;

public class Room extends Services {
    public String dichVuMienPhiDiKem;

    public Room(String tenDichVu, String soLuongNguoiToiDa, int dienTichSuDung, String kieuThue, double chiPhiThue, String dichVuMienPhiDiKem) {
        super(tenDichVu, soLuongNguoiToiDa, dienTichSuDung, kieuThue, chiPhiThue);
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    public String getDichVuMienPhiDiKem() {
        return dichVuMienPhiDiKem;
    }

    public void setDichVuMienPhiDiKem(String dichVuMienPhiDiKem) {
        this.dichVuMienPhiDiKem = dichVuMienPhiDiKem;
    }

    @Override
    public String showInfor() {
        return super.showInfor()+dichVuMienPhiDiKem;
    }
}
