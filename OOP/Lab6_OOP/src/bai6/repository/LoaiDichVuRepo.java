package bai6.repository;

import bai6.entity.DichVu;

import java.util.List;

public class LoaiDichVuRepo {
    public List<DichVu> dichVuList() {
        DichVu caoVoi = new DichVu("Cạo vôi", 100000L);
        DichVu tayTrang = new DichVu("Tẩy trắng", 1500000L);
        DichVu nhoRang = new DichVu("Nhổ răng", 150000L );
        DichVu tramRang = new DichVu("Trám răng", 200000L);
        return List.of(caoVoi, tayTrang, nhoRang, tramRang);
    }
}
