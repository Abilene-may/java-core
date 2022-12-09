package bai4.repository;

import bai4.entity.TienNghi;

import java.util.List;

public class LoaiTienNghiRepository {
    public List<TienNghi> loaiTienNghi() {
        TienNghi tiVi = new TienNghi("Ti vi", 10000L);
        TienNghi internet = new TienNghi("Internet", 10000L);
        TienNghi mayNuocNong = new TienNghi("May nuoc nong", 10000L);
        return List.of(tiVi, internet, mayNuocNong);
    }
}
