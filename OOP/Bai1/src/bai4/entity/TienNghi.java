package bai4.entity;

public class TienNghi {
    private String tenLoai;
    private long giaTienNghi;

    public TienNghi() {
    }

    public TienNghi(String tenLoai, long giaTienNghi) {
        this.tenLoai = tenLoai;
        this.giaTienNghi = giaTienNghi;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }

    public long getGiaTienNghi() {
        return giaTienNghi;
    }

    public void setGiaTienNghi(long giaTienNghi) {
        this.giaTienNghi = giaTienNghi;
    }

    @Override
    public String toString() {
        return "TienNghi{" +
                "tenLoai='" + tenLoai + '\'' +
                ", giaTienNghi=" + giaTienNghi +
                '}';
    }
}
