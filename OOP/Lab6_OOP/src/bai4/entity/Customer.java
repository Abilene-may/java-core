package bai4.entity;

public class Customer {
    private String ten;
    private String diaChi;

    public Customer() {
    }

    public Customer(String ten, String diaChi) {
        this.ten = ten;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "ten='" + ten + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
