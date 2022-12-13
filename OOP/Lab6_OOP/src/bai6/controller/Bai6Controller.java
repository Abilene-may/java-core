package bai6.controller;

import bai6.entity.HoaDon;
import bai6.repository.LoaiDichVuRepo;
import bai6.service.hoadonbai6.HoaDonImpl;
import bai6.service.hoadonbai6.HoaDonService;
import bai6.service.khach.KhachHangService;
import bai6.service.khach.KhachHangImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai6Controller {
    KhachHangService khachService = new KhachHangImpl();
    LoaiDichVuRepo loaiDichVuRepo = new LoaiDichVuRepo();
    HoaDonService hoaDonServiceBai6 = new HoaDonImpl(khachService, loaiDichVuRepo);
    List<HoaDon> hoaDonList = new ArrayList<>();
    HoaDon[] array = new HoaDon[5];

    public void homeControllerBai6() {
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;

        //Tạo hóa đơn
        while ( !isCheck ){
            HoaDon hoaDon = new HoaDon();
            menuBai6();
            int luaChon = sc.nextInt();
            switch (luaChon){

                //1, Nhập thông tin
                case 1:
                    hoaDon = taoHoaDon();
                    hoaDonList.add(hoaDon);
                    break;
                case 2:
                    System.out.print("Vui lòng nhập mã hóa đơn: ");
                    Long maHoaDon = sc.nextLong();
                    for (HoaDon x: hoaDonList){
                        if(x.getMaHoaDon().equals(maHoaDon)){
                            System.out.println(x.toString());
                        }
                    }
                    break;
                case 3:
                    List<HoaDon> list = hoaDonList.stream().sorted((o1, o2) -> (int)( o1.getTongTien() - o2.getTongTien())).collect(Collectors.toList());
                    System.out.println(list);
                    break;
                default:
                    isCheck = true;
                    break;
            }

        }




    }
    public void menuBai6() {
        System.out.println(" ===== MENU ===== ");
        System.out.println("1. Nhập thông tin khách hàng và dịch vụ");
        System.out.println("2. Tính tổng tiền");
        System.out.println("3. Hiện thị danh sách xắp sếp giảm dần");
        System.out.println( "Nhập số bất kỳ để thoát");
        System.out.print(" Nhập lựa chọn của bạn: ");
    }
    public HoaDon taoHoaDon(){
        return hoaDonServiceBai6.taoHoaDon();
    }



}
