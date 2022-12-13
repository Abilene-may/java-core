package bai6.entity;

public class DichVu {
    private String tenDichVu;
    private Long giaDichVu;

    public DichVu() {
    }
    public DichVu(String tenDichVu,  Long giaDichVu) {
        this.tenDichVu = tenDichVu;
        this.giaDichVu = giaDichVu;
    }


    public String getTenDichVu() {
        return tenDichVu;
    }

    public void setTenDichVu(String tenDichVu) {
        this.tenDichVu = tenDichVu;
    }


    public Long getGiaDichVu() {
        return giaDichVu;
    }

    public void setGiaDichVu(Long giaDichVu) {
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
