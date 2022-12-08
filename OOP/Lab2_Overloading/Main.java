package Lab2_Overloading;

import Lab2_Overloading.model.NhanVien;
import Lab2_Overloading.model.NhanVienFullTime;
import Lab2_Overloading.model.NhanVienPartTime;

public class Main {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Nguyen Van A");
        sep.setLoaiChucVu(Configs.NHAN_VIEN_SEP);
        NhanVienFullTime nv1 = new NhanVienFullTime("Nguyen Van B");
        NhanVienFullTime nv2 = new NhanVienFullTime("Nguyen Thi C");

        NhanVienPartTime tv = new NhanVienPartTime("Tran Thi D", 10);

        //Tinh luong cho nhan vien
        sep.tinhLuong();
        nv1.tinhLuong();
        nv2.tinhLuong();
        tv.tinhluong();

        sep.XuatThongTin();
        nv1.XuatThongTin();
        nv2.XuatThongTin();
        tv.XuatThongTin();
    }
}
