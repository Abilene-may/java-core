package org.example.controller;

import org.example.entity.SachGiaoKhoa;
import org.example.entity.TaiLieuDienTu;
import org.example.entity.TapChi;
import org.example.entity.ThuVien;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class ThuVienController {
    // 1. Tạo 1 danh sách <List> các loại sách trong thư viện
    private List<SachGiaoKhoa> sachGiaoKhoas = SachGiaoKhoa.taoListSGK();
    private List<TapChi> tapChis = TapChi.taoListTapChi();
    private List<TaiLieuDienTu> taiLieuDienTuList = TaiLieuDienTu.taoListTaiLieu();
    private ThuVien thuVien = new ThuVien(sachGiaoKhoas, tapChis, taiLieuDienTuList);


    public void thuVienController() {
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        while (!isCheck) {
            menu();
            int luaChon = sc.nextInt();
            sc.nextLine();
            switch (luaChon) {
                // Lấy thông tin sách theo từng thể loại (SGK, Tạp chí, báo, Tài liệu điện tử)
                case 1:
                    System.out.println("------- Sách giao khoa -------");
                    System.out.println(Arrays.toString(thuVien.getSachGiaoKhoaList().toArray()));
                    System.out.println("------- Tạp chí/ Báo -------");
                    System.out.println(Arrays.toString(thuVien.getTapChiList().toArray()));
                    System.out.println("-------- Tài liệu điện tử ---------");
                    System.out.println(Arrays.toString(thuVien.getTaiLieuDienTuList().toArray()));
                    break;

                //Lấy thông tin sách theo thể loại
                case 2:
                    System.out.print("Nhập thể loại bạn muốn tìm: ");
                    String theLoai = sc.nextLine();
                    thongTinSachTheoTheLoai(theLoai);
                    break;
                case 3:
                    System.out.println(" 5 tài liệu điện tử được tải nhiều nhất");
                    List<TaiLieuDienTu> collect = taiLieuDienTuList.stream().sorted((o1, o2) ->
                            Math.toIntExact((o1.getLuotTai() - o2.getLuotTai()))).limit(5).collect(Collectors.toList());
                    System.out.println(Arrays.toString(collect.toArray()));
                    break;

                //Lấy ra Tạp chí, báo được xuất bản trong năm hiện tại
                case 4:
                    List<TapChi> tapChiList = new ArrayList<>();
                    LocalDate localDate = LocalDate.now();
                    for (TapChi tapChi : tapChis) {
                        if (localDate.getYear() == tapChi.getNamXuatBan()) {
                            tapChiList.add(tapChi);
                        }
                    }
                    System.out.println(Arrays.toString(tapChiList.toArray()));
            }

        }

    }

    public void thongTinSachTheoTheLoai(String theLoai) {
        switch (theLoai) {
            case "Sach giao khoa", "sach giao khoa", "sgk":
                System.out.println(thuVien.getSachGiaoKhoaList().toString());
                break;
            case "Tap chi", "tap chi", "Bao", "bao":
                System.out.println(thuVien.getTapChiList().toString());
                break;
            case "Tai lieu dien tu", "tai lieu dien tu":
                System.out.println(thuVien.getTaiLieuDienTuList().toString());
                break;
            default:
                System.out.println("Thư viện không có thể loại " + theLoai);
                break;

        }
    }

    public void menu() {
        System.out.print("------------------------------\n" +
                "1. Lấy thông tin sách theo từng thể loại\n" +
                "2. Lấy thông tin sách theo thể loại\n" +
                "3. Thông tin 5 tài liệu điện tử tải nhiều nhất\n" +
                "4. In tạp chí được xuất bản trong năm hiện tại\n" +
                " Nhập lựa chọn của bạn: ");
    }

}
