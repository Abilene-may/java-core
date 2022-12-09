package bai4.repository;

import bai4.entity.Phong;

import java.util.List;

public class LoaiPhongRepository {
    public List<Phong> danhSachPhong(){
        Phong phongDon = new Phong("Phong don",300000L);
        Phong phongDoi = new Phong("Phong doi",350000L);
        Phong phongBa = new Phong("Phong ba",400000L);
        return List.of(phongDon,phongDoi,phongBa);
    }
}
