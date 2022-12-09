package bai4.repository;

import bai4.entity.DichVu;

import java.util.List;

public class LoaiDichVuRespository {
    public List<DichVu> dichVuList() {
        DichVu karaoke = new DichVu("Karaoke", 50000L);
        DichVu anSang = new DichVu("An sang", 15000L);
        return List.of(karaoke, anSang);
    }
}
