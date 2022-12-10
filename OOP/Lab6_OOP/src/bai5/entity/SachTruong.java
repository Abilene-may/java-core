package bai5.entity;

public class SachTruong extends ThuVien{
    private long soTrang;
    private String tinhTrang;

    public SachTruong() {
    }

    public SachTruong(String maSach, String tenSach, String nhaXuatBan, int namXuatBan,
                      Long soLuong, String viTri, long soTrang, String tinhTrang) {
        super(maSach, tenSach, nhaXuatBan, namXuatBan, soLuong, viTri);
        this.soTrang = soTrang;
        this.tinhTrang = tinhTrang;
    }

    public long getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(long soTrang) {
        this.soTrang = soTrang;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public String toString() {
        return super.toString() + "SachTruong{" +
                "soTrang=" + soTrang +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }
}
