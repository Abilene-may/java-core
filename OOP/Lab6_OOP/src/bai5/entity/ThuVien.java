package bai5.entity;

public class ThuVien {
    private String maSach;
    private String tenSach;
    private String nhaXuatBan;
    private int namXuatBan;
    private int soLuong;
    private int viTri;

    public ThuVien() {
    }

    public ThuVien(String maSach, String tenSach, String nhaXuatBan,
                   int namXuatBan, int soLuong, int viTri) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.nhaXuatBan = nhaXuatBan;
        this.namXuatBan = namXuatBan;
        this.soLuong = soLuong;
        this.viTri = viTri;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getNamXuatBan() {
        return namXuatBan;
    }

    public void setNamXuatBan(int namXuatBan) {
        this.namXuatBan = namXuatBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public int getViTri() {
        return viTri;
    }

    public void setViTri(int viTri) {
        this.viTri = viTri;
    }
}
