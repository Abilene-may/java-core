package bai6.service.hoadonbai6;

import bai6.entity.DichVu;
import bai6.entity.HoaDon;
import bai6.entity.KhachHang;
import bai6.repository.LoaiDichVuRepo;
import bai6.service.khach.KhachHangService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonImpl implements HoaDonService {
    private final KhachHangService khachHangService;
    private final LoaiDichVuRepo loaiDichVuRepo;

    public HoaDonImpl(KhachHangService khachHangService, LoaiDichVuRepo loaiDichVuRepo) {
        this.khachHangService = khachHangService;
        this.loaiDichVuRepo = loaiDichVuRepo;
    }


    @Override
    public HoaDon taoHoaDon() {
        Scanner sc = new Scanner(System.in);
        HoaDon hoaDon = new HoaDon();
        // 1. Tạo mã hóa đơn
        System.out.print("Mã hóa đơn: ");
        Long maHoaDon = sc.nextLong();
        sc.nextLine();
        hoaDon.setMaHoaDon(maHoaDon);

        //2. Tạo khách hàng
        KhachHang khachHang = khachHangService.taoKhachHangbai6();
        hoaDon.setKhachHang(khachHang);

        //Tạo 1 danh sách những dịch vụ đã chọn
        List<DichVu> dichVuDaChon = new ArrayList<>();
        //Lấy dữ liệu dịch vụ từ respo
        List<DichVu> dichVuList = loaiDichVuRepo.dichVuList();

        System.out.println("Khách hàng cạo vôi ko? 1- có , số khác - ko");
        int chonCaoVoi = sc.nextInt();
        if(chonCaoVoi == 1){
            dichVuDaChon.add(dichVuList.get(0));
        }

        System.out.println("Khách hàng cạo trắng ko?  1- có , số khác - ko");
        int chonTayTrang = sc.nextInt();
        if(chonTayTrang == 1){
            dichVuDaChon.add(dichVuList.get(1));
        }
        System.out.print("Nhập số lượng răng nhổ : ");
        int soLuongRangNho = sc.nextInt();
        for(int i = 0 ; i < soLuongRangNho; i++){
            dichVuDaChon.add(dichVuList.get(2));
        }
        System.out.print("Nhạp số lượng trám răng : ");
        int soLuongTramRang = sc.nextInt();
        for(int i = 0 ; i < soLuongTramRang; i++){
            dichVuDaChon.add(dichVuList.get(3));
        }

        hoaDon.setDichVuList(dichVuDaChon);

        // 4. Tính tổng tiền
        Long tongTien = tongTien(dichVuDaChon);
        hoaDon.setTongTien(tongTien);

        return hoaDon;
    }
    public void menuDichVu(){
        System.out.println("1. Cạo vôi");
        System.out.println("2. Tẩy trắng");
        System.out.println("3. Nhổ răng");
        System.out.println("4. Trám răng");
        System.out.println(" Nhập số bất kỳ để thoát");
        System.out.print(" Nhập lựa chọn của bạn: ");

    }
    public DichVu chonDichVu(int luachon, List<DichVu> list){
        return switch (luachon)
        {
            case 1 -> list.get(0);
            case 2 -> list.get(1);
            case 3 -> list.get(2);
            case 4 -> list.get(3);
            default -> null;
        };
    }
    public Long tongTien(List<DichVu> dichVuDaChon){
        Long tong = 0L;
        for( DichVu x: dichVuDaChon){
            tong += x.getGiaDichVu();
        }
        return tong;
    }


}
