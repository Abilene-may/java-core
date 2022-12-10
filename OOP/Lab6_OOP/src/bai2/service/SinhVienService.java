package bai2.service;

import bai1.HinhChuNhat;
import bai2.SinhVien;
import bai2.TinChi;

import java.util.Scanner;


public class SinhVienService {

    public SinhVien createSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        String maSV = sc.nextLine();
        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("So luong tin chi: ");
        int soLuongTin = sc.nextInt();
        TinChi[] thongTin = new TinChi[soLuongTin];
        for (int i = 0; i < soLuongTin; i++){
            thongTin[i] = new TinChi();
            thongTin[i].nhapTinChi();
        }
        return new SinhVien(maSV, hoTen, soLuongTin, thongTin);
    }

    public double tinhDienTich(HinhChuNhat hinhChuNhat){
        return hinhChuNhat.getWidth() * hinhChuNhat.getLength();
    }
}
