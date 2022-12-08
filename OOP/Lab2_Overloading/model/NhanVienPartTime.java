package Lab2_Overloading.model;

import Lab2_Overloading.Configs;

public class NhanVienPartTime extends NhanVien{
    private int gioLamViec;
    public NhanVienPartTime(String ten, int gioLamViec){
        super(ten);
        this.gioLamViec = gioLamViec;
    }

    @Override
    public String LoaiNhanVien(){
        return "Nhan vien thoi vu";
    }

    public void tinhluong(){
        luong = (int) (Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec);
    }
}
