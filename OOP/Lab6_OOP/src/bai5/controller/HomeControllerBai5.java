package bai5.controller;

import bai5.entity.PhieuYeuCau;
import bai5.entity.SachTruong;
import bai5.service.phieuyeucau.PhieYeuCauImplement;
import bai5.service.phieuyeucau.PhieuYeuCauService;
import bai5.service.sachtruong.SachTruongImpl;
import bai5.service.sachtruong.SachTruongService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeControllerBai5 {

    SachTruongService sachTruongService = new SachTruongImpl();
    PhieuYeuCauService phieuYeuCauService = new PhieYeuCauImplement(sachTruongService);
    PhieuYeuCau phieuYeuCau = new PhieuYeuCau();
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
        phieuYeuCau = phieuYeuCauService.taoPhieuYeuCau();
        phieuYeuCauList.add(phieuYeuCau);
    }
    public void inPhieuYeuCau(){
        phieuYeuCauList.forEach(x -> {
            System.out.println(x.toString());
        });
    }
    public void tonKho(){
//        Long tongSachMuon = 0L;
//        for(PhieuYeuCau phieuYeuCau: phieuYeuCauList){
//            tongSachMuon += phieuYeuCau.getSoLuongMuon();
//        }
//        Long soLuongSach = 0L;
//        System.out.println("Tồn kho: " + (soLuongSach - tongSachMuon));
        System.out.println("Tồn kho: " + phieuYeuCau.tonKho());
    }

    public void menu(){
        System.out.println(" ===== MENU =====");
        System.out.println("1 - Tạo phiếu yêu cầu");
        System.out.println("2 - In phiếu yêu cầu");
        System.out.println("3 - Thông tin tồn kho");
        System.out.println(" Nhập số bất kỳ để thoát");
        System.out.print(" Nhập lựa chọn của bạn: ");
    }

}
