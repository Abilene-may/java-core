package bai4.service.hoadon;

import bai4.entity.*;
import bai4.repository.LoaiDichVuRespository;
import bai4.repository.LoaiPhongRepository;
import bai4.repository.LoaiTienNghiRepository;
import bai4.service.khach.KhachService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HoaDonImpl implements HoaDonService {

    private final KhachService khachService;

    private final LoaiPhongRepository loaiPhongRepository;

    private final LoaiTienNghiRepository loaiTienNghiRepository;
    private final LoaiDichVuRespository loaiDichVuRespository;

    public HoaDonImpl(KhachService khachService,LoaiPhongRepository loaiPhongRepository,
                      LoaiTienNghiRepository loaiTienNghiRepository, LoaiDichVuRespository loaiDichVuRespository) {
        this.khachService = khachService;
        this.loaiPhongRepository = loaiPhongRepository;
        this.loaiTienNghiRepository = loaiTienNghiRepository;
        this.loaiDichVuRespository = loaiDichVuRespository;
    }

    @Override
    public HoaDon toaHoaDon() {
        Scanner sc = new Scanner(System.in);
        HoaDon hoaDon = new HoaDon();

        //1.nhập hóa đơn
        System.out.print("ID: ");
        Long id = sc.nextLong();
        hoaDon.setId(id);

        //2.nhập số ngày ở
        System.out.println("Nhap so ngay o : ");
        int soNgayO = sc.nextInt();
        hoaDon.setSoNgayO(soNgayO);

        //3.Tao khach hang
        Customer khachHang = khachService.taoKhachHang();
        hoaDon.setKhach(khachHang);

        //4.Tạo phòng
        //4.1.Hiện thị menu loại phòng
        hienThiPhong();
        System.out.print("Chon loai phong : ");
        int loaiPhong = sc.nextInt();
        List<Phong> listPhong = loaiPhongRepository.danhSachPhong();
        //4.2.Nhập phong cho hóa đơn
        Phong phong = chonPhong(loaiPhong,listPhong);
        hoaDon.setPhong(phong);

        //5. Tạo tiện nghi
        System.out.print("Nhập số lượng tiện nghi : ");
        int soLuong  = sc.nextInt();
        List<TienNghi> tienNghiDaChon = new ArrayList<>();
        List<TienNghi> listTienNghi = loaiTienNghiRepository.loaiTienNghi();
        for (int i = 0 ; i < soLuong ; i++){
            hienThiTienNghi();
            System.out.print("Chọn loại tiện nghi: ");
            int loaiTienNghi = sc.nextInt();
            TienNghi tienNghi = chonTienNghi(loaiTienNghi,listTienNghi);
            tienNghiDaChon.add(tienNghi);
        }
        hoaDon.setTienNghi(tienNghiDaChon);

        //6. Tạo dịch vụ
        System.out.print("Nhập số lượng dịch vụ: ");
        int soLuongDvu = sc.nextInt();
        List<DichVu> dichVuDaChon = new ArrayList<>();
        List<DichVu> listDichVu = loaiDichVuRespository.dichVuList();
        for(int i = 0; i < soLuongDvu ; i++){
            hienThiDichVu();
            System.out.print("Chọn loại dịch vụ: ");
            int loaiDichVu = sc.nextInt();
            DichVu dichVu = chonDichVu(loaiDichVu, listDichVu);
            dichVuDaChon.add(dichVu);
        }
        hoaDon.setDichVuList(dichVuDaChon);

        //7. tính tiền hóa đơn
        Long tongTien = tongTien(phong,tienNghiDaChon,listDichVu,soNgayO);
        hoaDon.setTongTien(tongTien);

        return hoaDon;
    }

    public Long tongTien(Phong phong, List<TienNghi> tienNghiDaChon, List<DichVu> listDichVu, int soNgayO){
        Long tongTien = phong.getGiaPhong() * soNgayO;

        for(TienNghi x : tienNghiDaChon){
            tongTien += x.getGiaTienNghi();
        }

        for (DichVu x : listDichVu){
            tongTien += x.getGiaDichVu();
        }

        return tongTien;
    }

    public TienNghi chonTienNghi(int loai, List<TienNghi> list){
        return switch (loai){
            case 1 -> list.get(1);
            case 2 -> list.get(2);
            case 3 -> list.get(3);
            default -> null;
        };
    }

    public Phong chonPhong(int loai,List<Phong> list){

        return switch (loai) {
            case 1 -> list.get(0);
            case 2 -> list.get(1);
            case 3 -> list.get(2);
            default -> null;
        };
    }
    public DichVu chonDichVu(int loai, List<DichVu> list)
    {
        return switch (loai){
            case 1 -> list.get(0);
            case 2 -> list.get(1);
            default -> null;
        };
    }
    public void hienThiTienNghi(){
        System.out.println("1 - Tivi");
        System.out.println("2 - Internet");
        System.out.println("3 - Máy nước nóng");
    }

    public void hienThiPhong(){
        System.out.println("1 - Phòng đơn");
        System.out.println("2 - Phòng đôi");
        System.out.println("3 - Phòng ba");
    }

    public void hienThiDichVu(){
        System.out.println("1 - Karaoke");
        System.out.println("2 - Ăn sáng");
    }

}
