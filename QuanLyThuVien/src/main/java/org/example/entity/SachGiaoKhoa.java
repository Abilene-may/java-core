package org.example.entity;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class SachGiaoKhoa {
    private Long id;
    private String ten;
    private String theLoai;
    private String tacGia;
    private int namXuatBan;
    private String nhaXuatBan;
    private int soTrang;
    private int soLuong;

    public static List<SachGiaoKhoa> taoListSGK() {
        List<SachGiaoKhoa> sachGiaoKhoa = new ArrayList<>();
        sachGiaoKhoa.add(new SachGiaoKhoa(111L, "Hoa hoc", "Sach giao khoa", "Thu Trang",
                2018, "Kim Dong", 120, 12));
        sachGiaoKhoa.add(new SachGiaoKhoa(112L, "Sinh hoc", "Sach giao khoa", "Thuy Linh",
                2014, "Kim Dong", 57, 17));
        sachGiaoKhoa.add(new SachGiaoKhoa(113L, "Khoa hoc", "Sach giao khoa", "Tuan Dung",
                2020, "Kim Dong", 234, 20));
        sachGiaoKhoa.add(new SachGiaoKhoa(114L, "Lich su", "Sach giao khoa", "Thanh Huyen",
                2019, "Kim Dong", 145, 10));
        sachGiaoKhoa.add(new SachGiaoKhoa(115L, "Dia ly", "Sach giao khoa", "Nguyen Thien",
                2018, "Kim Dong", 114, 8));
        return sachGiaoKhoa;
    }

}
