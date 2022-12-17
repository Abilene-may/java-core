package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TapChi {
    private Long id;
    private String ten;
    private String toaSoan;
    private int namXuatBan;
    private String theLoai;
    private int soTrang;
    private int soLuong;

    public static List<TapChi> taoListTapChi() {
        List<TapChi> tapChis = new ArrayList<>();
        tapChis.add(new TapChi(221L, "Thoi trang hom nay", "toa soan ABC", 2022,
                "Tap chi", 15, 50));
        tapChis.add(new TapChi(222L, "Bao la cai", "toa soan Phy lam", 2018,
                "Bao", 4, 60));
        tapChis.add(new TapChi(223L, "Tin nong Showbiz", "toa soan mensi", 2022,
                "Bao", 6, 100));
        tapChis.add(new TapChi(224L, "Tap chi hoa hong", "toa soan Hoa hong", 2020,
                "Tap chi", 25, 130));
        tapChis.add(new TapChi(225L, "Bao thanh nien", "toa soan Thanh nien", 2021,
                "Bao", 11, 25));
        return tapChis;
    }

}
