package bai2;

import java.util.Scanner;

public class TinChi extends MonHoc{
    private double DiemTP;
    private double DiemThi;

    public TinChi() {
        super();
    }

    public double getDiemTP() {
        return DiemTP;
    }


    public TinChi(String maMon, String tenMon, int soTin) {
        super(maMon, tenMon, soTin);
    }

    public void setDiemTP(double diemTP) {
        DiemTP = diemTP;
    }

    public double getDiemThi() {
        return DiemThi;
    }

    public void setDiemThi(double diemThi) {
        DiemThi = diemThi;
    }

    public TinChi(String maMon, String tenMon, int soTin, double diemTP, double diemThi) {
        super(maMon, tenMon, soTin);
        DiemTP = diemTP;
        DiemThi = diemThi;
    }
    public double tinhDiem(){
        return 0.3 * DiemTP + 0.7 * DiemThi;
    }

    public void nhapTinChi(){
        Scanner sc = new Scanner(System.in);
        super.nhapMonHoc();
        System.out.print("Diem thanh phan: ");
        DiemTP = sc.nextDouble();
        System.out.print("Diem thi: ");
        DiemThi = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "TinChi{" + super.toString() +
                "DiemTP=" + DiemTP +
                ", DiemThi=" + DiemThi +
                '}';
    }
}
