package bai4.entity;

import java.util.List;

public class HoaDon {
    private Long id;

    private Customer khach;

    private Phong phong;

    List<DichVu> dichVuList;

    List<TienNghi> tienNghi;

    private int soNgayO;

    private Long tongTien;

    public HoaDon(Long id, Customer khach, Phong phong, List<DichVu> dichVuList, List<TienNghi> tienNghi, int soNgayO, Long tongTien) {
        this.id = id;
        this.khach = khach;
        this.phong = phong;
        this.dichVuList = dichVuList;
        this.tienNghi = tienNghi;
        this.soNgayO = soNgayO;
        this.tongTien = tongTien;
    }

    public HoaDon() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Customer getKhach() {
        return khach;
    }

    public void setKhach(Customer khach) {
        this.khach = khach;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public List<DichVu> getDichVuList() {
        return dichVuList;
    }

    public void setDichVuList(List<DichVu> dichVuList) {
        this.dichVuList = dichVuList;
    }

    public List<TienNghi> getTienNghi() {
        return tienNghi;
    }

    public void setTienNghi(List<TienNghi> tienNghi) {
        this.tienNghi = tienNghi;
    }

    public int getSoNgayO() {
        return soNgayO;
    }

    public void setSoNgayO(int soNgayO) {
        this.soNgayO = soNgayO;
    }

    public Long getTongTien() {
        return tongTien;
    }

    public void setTongTien(Long tongTien) {
        this.tongTien = tongTien;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "id=" + id +
                ", khach=" + khach +
                ", phong=" + phong +
                ", dichVuList=" + dichVuList +
                ", tienNghi=" + tienNghi +
                ", soNgayO=" + soNgayO +
                ", tongTien=" + tongTien +
                '}';
    }
}
