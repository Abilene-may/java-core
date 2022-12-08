package bai2.service;

import bai1.HinhChuNhat;
import bai2.SinhVien;

import java.util.Scanner;


public class SinhVienService {

    public SinhVien createSinhVien() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma sinh vien: ");
        String maSV = sc.nextLine();
        System.out.print("Ho ten: ");
        String hoTen = sc.nextLine();
        return new SinhVien(maSV, hoTen);
    }

    public double tinhDienTich(HinhChuNhat hinhChuNhat){
        return hinhChuNhat.getWidth() * hinhChuNhat.getLength();
    }
}
