package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TaiLieuDienTu {
    private Long id;
    private String ten;
    private String tacGia;
    private int namXuatBan;
    private LocalDate ngayUpload;
    private String theLoai;
    private Long dungLuong;
    private Long luotTai;

    public static List<TaiLieuDienTu> taoListTaiLieu() {
        List<TaiLieuDienTu> taiLieuDienTuList = new ArrayList<>();
        taiLieuDienTuList.add(new TaiLieuDienTu(331L, "Java", "John", 2021,
                LocalDate.of(2021, 12, 22), "Tai lieu", 500L, 12000L));
        taiLieuDienTuList.add(new TaiLieuDienTu(332L, "Python", "Emma Waston", 2020,
                LocalDate.of(2020, 10, 2), "Tai lieu", 234L, 145670L));
        taiLieuDienTuList.add(new TaiLieuDienTu(333L, "C/C++", "Sprid Maste", 2022,
                LocalDate.of(2022, 5, 15), "Tai lieu", 145L, 345670L));
        taiLieuDienTuList.add(new TaiLieuDienTu(334L, "HTML/CSS", "Heman K", 2020,
                LocalDate.of(2019, 3, 22), "Tai lieu", 456L, 4567922L));
        taiLieuDienTuList.add(new TaiLieuDienTu(335L, "FullSack", "March Edi", 2022,
                LocalDate.of(2020, 3, 4), "Tai lieu", 222L, 233556L));
        taiLieuDienTuList.add(new TaiLieuDienTu(335L, "Cau truc du lieu", "Mank kaner", 2016,
                LocalDate.of(2017, 7, 16), "Tai lieu", 147L, 135000L));
        taiLieuDienTuList.add(new TaiLieuDienTu(335L, "Giai thuat", "March Edi", 2022,
                LocalDate.of(2016, 5, 24), "Tai lieu", 245L, 4508790L));
        return taiLieuDienTuList;
    }

}
