package bai5.entity;

public class PhieuYeuCau {
    private long id;
    private SachTruong sachTruong;
    private int soLuongMuon;

    public PhieuYeuCau() {
    }

    public PhieuYeuCau(long id, SachTruong sachTruong, int soLuongMuon) {
        this.id = id;
        this.sachTruong = sachTruong;
        this.soLuongMuon = soLuongMuon;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public SachTruong getSachTruong() {
        return sachTruong;
    }

    public void setSachTruong(SachTruong sachTruong) {
        this.sachTruong = sachTruong;
    }

    public int getSoLuongMuon() {
        return soLuongMuon;
    }

    public void setSoLuongMuon(int soLuongMuon) {
        this.soLuongMuon = soLuongMuon;
    }

    @Override
    public String toString() {
        return "PhieuYeuCau{" +
                "id=" + id +
                ", sachTruong=" + sachTruong +
                ", soLuongMuon=" + soLuongMuon +
                '}';
    }

    public Long tonKho(){
        return sachTruong.getSoLuong() - soLuongMuon;
    }

}
