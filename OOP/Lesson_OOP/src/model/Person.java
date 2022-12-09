package model;

public class Person {
    private String hoTen;
    private int tuoi;
    private String diaChi;

    public Person() {
    }

    public Person(String hoTen, int tuoi, String diaChi) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hoTen=" + hoTen +
                ", tuoi='" + tuoi + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }

    public void study(){
        System.out.println("Học tiếng Anh");
    }
    public void sleep(){
        System.out.println("Đã ngủ 8 tiếng");
    }
}
