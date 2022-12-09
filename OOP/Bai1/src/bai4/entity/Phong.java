package bai4.entity;

public class Phong {
    private String loaiPhong;
    private Long giaPhong;

    public Phong(String loaiPhong, Long giaPhong) {
        this.loaiPhong = loaiPhong;
        this.giaPhong = giaPhong;
    }

    public Phong() {
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public Long getGiaPhong() {
        return giaPhong;
    }

    public void setGiaPhong(Long giaPhong) {
        this.giaPhong = giaPhong;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "loaiPhong='" + loaiPhong + '\'' +
                ", giaPhong=" + giaPhong +
                '}';
    }
}
