package bai4.entity;

public class DichVu {
    private String tenDichVu;
    private long giaDichVu;

    public DichVu() {

    }

    public DichVu(String tenDichVu, long giaDichVu) {
        this.tenDichVu = tenDichVu;
        this.giaDichVu = giaDichVu;
    }

    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }

    public long getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(long giaDichVu) {
        this.giaDichVu = giaDichVu;
    }

    @Override
    public String toString() {
        return "DichVu{" +
                "tenDichVu='" + tenDichVu + '\'' +
                ", giaDichVu=" + giaDichVu +
                '}';
    }
}
