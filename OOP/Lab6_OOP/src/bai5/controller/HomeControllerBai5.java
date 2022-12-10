package bai5.controller;

import bai5.entity.PhieuYeuCau;
import bai5.entity.SachTruong;
import bai5.entity.ThuVien;
import bai5.service.phieuyeucau.PhieYeuCauImplement;
import bai5.service.phieuyeucau.PhieuYeuCauService;
import bai5.service.sachtruong.SachTruongInpl;
import bai5.service.sachtruong.SachTruongService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeControllerBai5 {

    SachTruongService sachTruongService = new SachTruongInpl();
    PhieuYeuCauService phieuYeuCauService = new PhieYeuCauImplement(sachTruongService);
    SachTruong sachTruong = new SachTruong();
    List<PhieuYeuCau> phieuYeuCauList = new ArrayList<>();

    public void homeControllerBai5(){
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        while ( !isCheck ){
            menu();
            int luaChon = sc.nextInt();
            switch (luaChon) {
                case 1 -> taoPhieuYeuCau();
                case 2 -> inPhieuYeuCau();
                case 3 -> tonKho();
                default -> {
                    System.out.println("Kết thúc chương trình");
                    isCheck = true;
                }
            }
        }
    }

    public void taoPhieuYeuCau(){
        PhieuYeuCau phieuYeuCau = phieuYeuCauService.taoPhieuYeuCau();
        phieuYeuCauList.add(phieuYeuCau);
    }
    public void inPhieuYeuCau(){
        phieuYeuCauList.forEach(x -> {
            System.out.println(x.toString());
        });
    }
    public void tonKho(){
        int tongSachMuon = 0;
        for(PhieuYeuCau phieuYeuCau: phieuYeuCauList){
            tongSachMuon += phieuYeuCau.getSoLuongMuon();
        }
        long soLuongSach = sachTruong.getSoLuong();
        System.out.println("Tồn kho: " + (soLuongSach - tongSachMuon));
    }

    public void menu(){
        System.out.println(" ===== MENU =====");
        System.out.println("1 - Tạo phiếu yêu cầu");
        System.out.println("2 - In phiếu yêu cầu");
        System.out.println("3 - Thông tin tồn kho");
        System.out.println("Nhập số bất kỳ để thoát");
        System.out.print("Nhập lựa chọn của bạn: ");
    }

}
