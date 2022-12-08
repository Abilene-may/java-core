package Lab2_Overloading.model;

public class NhanVien {
    protected String ten;
    protected int luong;

    public NhanVien() {
    }

    public NhanVien(String ten) {
        this.ten = ten;
    }

    // override
    protected String LoaiNhanVien() {
        return "";
    }

    public void XuatThongTin() {
        System.out.println("Nhan vien: " + ten);
        System.out.print("Loai nhan vien: " + LoaiNhanVien()
                + "\nLuong: " + luong + " $ \n");
    }

}
