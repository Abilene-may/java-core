package bai6.entity;

import java.util.List;

public class HoaDon {
    private Long maHoaDon;
    private KhachHang khachHang;
    List<DichVu> dichVuList;
    private Long tongTien;

    public HoaDon() {
    }

    public HoaDon(Long maHoaDon, KhachHang khachHang, List<DichVu> dichVuList, Long tongTien) {
        this.maHoaDon = maHoaDon;
        this.khachHang = khachHang;
        this.dichVuList = dichVuList;
        this.tongTien = tongTien;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public List<DichVu> getDichVuList() {
        return dichVuList;
    }

    public void setDichVuList(List<DichVu> dichVuList) {
        this.dichVuList = dichVuList;
    }

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;
    }

    public Long getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(Long maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon=" + maHoaDon +
                ", khachHang=" + khachHang +
                ", dichVuList=" + dichVuList +
                ", tongTien=" + tongTien +
                '}';
    }
}
