package Lab2_Overloading.model;

import Lab2_Overloading.Configs;

public class NhanVienFullTime extends NhanVien {
    private int ngayLamThem;
    private int LoaiChucVu;

    public NhanVienFullTime(String ten) {
        super.ten = ten;
        this.LoaiChucVu = Configs.NHAN_VIEN_LINH;

    }

    public NhanVienFullTime(String ten, int ngayLamThem) {
        super(ten);
        this.ngayLamThem = ngayLamThem;
        this.LoaiChucVu = Configs.NHAN_VIEN_LINH;

    }

    public void setLoaiChucVu(int loaiChucVu) {
        this.LoaiChucVu = loaiChucVu;
    }

    @Override
    public String LoaiNhanVien() {
        if (LoaiChucVu == Configs.NHAN_VIEN_LINH)
            return "Linh toan thoi gian " + (ngayLamThem > 0 ? " (Co lam them ngay )" : "");
        else
            return "Sep toan thoi gian " + (ngayLamThem > 0 ? " (Co lam them ngay )" : "");
    }

    public void tinhLuong() {
        if (LoaiChucVu == Configs.NHAN_VIEN_LINH)
            luong = (int) (Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem);
        else
            luong = (int) (Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOI_NGAY * ngayLamThem);
    }

}
