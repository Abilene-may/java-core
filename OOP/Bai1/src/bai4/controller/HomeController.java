package bai4.controller;

import bai4.entity.HoaDon;
import bai4.repository.LoaiDichVuRespository;
import bai4.repository.LoaiPhongRepository;
import bai4.repository.LoaiTienNghiRepository;
import bai4.service.hoadon.HoaDonImpl;
import bai4.service.hoadon.HoaDonService;
import bai4.service.khach.KhachImpl;
import bai4.service.khach.KhachService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HomeController {

    LoaiTienNghiRepository loaiTienNghiRepository = new LoaiTienNghiRepository();
    LoaiPhongRepository loaiPhongRepository = new LoaiPhongRepository();
    LoaiDichVuRespository loaiDichVuRespository = new LoaiDichVuRespository();
    KhachService khachService = new KhachImpl();
    HoaDonService hoaDonService = new HoaDonImpl(khachService,loaiPhongRepository,loaiTienNghiRepository,loaiDichVuRespository);
    List<HoaDon> hoaDonList = new ArrayList<>();

    public void taoHoaDon(){
            HoaDon hoaDon = hoaDonService.toaHoaDon();
            hoaDonList.add(hoaDon);
    }

    public void inHoaDon(){
        hoaDonList.forEach(x -> {
            System.out.println(x.toString());
        });
    }

    public void tongHoaDon(){
        Long tong = 0L;
        for (HoaDon x : hoaDonList){
            tong += x.getTongTien();
        }
        System.out.println("tổng doanh thu : " + tong);
    }

    public void homeController(){
        boolean isCheck = false;
        Scanner sc = new Scanner(System.in);
        while( !isCheck ){
            menu();
            int luachon = sc.nextInt();
            switch (luachon){
                case 1:
                    taoHoaDon();
                    break;
                case 2:
                    inHoaDon();
                    break;
                case 3:
                    tongHoaDon();
                    break;
                default:
                    System.out.println("Kết thúc chương trình");
                    isCheck = true;
            }
        }
    }

    public static void menu() {
        System.out.println("============MENU===========");
        System.out.println("1 - Tạo hóa đơn");
        System.out.println("2 - In hóa đơn");
        System.out.println("3 - Tính tổng doanh thu");
        System.out.println("Nhập số bất kì để thoát");
        System.out.print("Nhập lựa chọn : ");
    }
}
