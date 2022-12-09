package bai2;

import java.util.Arrays;
import java.util.Scanner;

public class SinhVien {
    private String maSV;
    private String hoTen;
    private int soLuongTin;
    private TinChi[] thongTinTinChi;

    public SinhVien() {

    }
    public SinhVien(String maSV, String hoTen, int soLuongTin, TinChi[] thongTinTinChi) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.soLuongTin = soLuongTin;
        this.thongTinTinChi = thongTinTinChi;
    }

    public SinhVien(String maSV, String hoTen, int soLuongTin) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.soLuongTin = soLuongTin;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getSoLuongTin() {
        return soLuongTin;
    }

    public void setSoLuongTin(int soLuongTin) {
        this.soLuongTin = soLuongTin;
    }

    public TinChi[] getThongTinTinChi() {
        return thongTinTinChi;
    }

    public void setThongTinTinChi(TinChi[] thongTinTinChi) {
        this.thongTinTinChi = thongTinTinChi;
    }

    public double tongKet(TinChi[] thongTinTinChi){
        int sum = 0;
        int tongSoTin = 0 ;
        for(int i = 0; i < soLuongTin ; i++){
            sum += (thongTinTinChi[i].tinhDiem() * thongTinTinChi[i].getSoTin());
            tongSoTin += thongTinTinChi[i].getSoTin();
        }
        return (double) (sum / tongSoTin);
    }



//    public void nhap(){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Ma sinh vien: ");
//        maSV = sc.nextLine();
//        System.out.print("Ho ten: ");
//        hoTen = sc.nextLine();
//        System.out.print("So luong tin chi: ");
//        soLuongTin = sc.nextInt();
//        thongTinTinChi = new TinChi[soLuongTin];
//        for(int i = 0; i < soLuongTin ; i++){
//            thongTinTinChi[i] = new TinChi();
//            thongTinTinChi[i].nhapTinChi();
//        }
//
//
//    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSV='" + maSV + '\'' +
                ", hoTen='" + hoTen + '\'' +
                ", soLuongTin=" + soLuongTin +
                ", thongTinTinChi=" + Arrays.toString(thongTinTinChi) +
                '}';
    }

    public String xepLoai(Double diem){
        if(diem < 6){
            return "TB";
        } else if (diem >= 6 && diem < 8) {
            return "Khá";
        } else {
            return "Giỏi";
        }
    }
}
