package bai2;

import java.util.Scanner;

public class MonHoc {
    private String MaMon;
    private String TenMon;
    private int SoTin;

    public MonHoc(String maMon, String tenMon, int soTin) {
        MaMon = maMon;
        TenMon = tenMon;
        SoTin = soTin;
    }

    public MonHoc() {

    }

    public String getMaMon() {
        return MaMon;
    }

    public void setMaMon(String maMon) {
        MaMon = maMon;
    }

    public String getTenMon() {
        return TenMon;
    }

    public void setTenMon(String tenMon) {
        TenMon = tenMon;
    }

    public int getSoTin() {
        return SoTin;
    }

    public void setSoTin(int soTin) {
        SoTin = soTin;
    }

    public void nhapMonHoc(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma mon: ");
        MaMon = sc.nextLine();
        System.out.print("Ten mon: ");
        TenMon = sc.nextLine();
        System.out.print("So tin chi: ");
        SoTin = Integer.parseInt(sc.nextLine());
    }

    @Override
    public String toString() {
        return "MonHoc{" +
                "MaMon='" + MaMon + '\'' +
                ", TenMon='" + TenMon + '\'' +
                ", SoTin=" + SoTin +
                '}';
    }
}
