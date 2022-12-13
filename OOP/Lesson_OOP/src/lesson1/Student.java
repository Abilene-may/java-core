package lesson1;

public class Student extends Person {
    private double DiemLyThuyet;
    private double DiemThucHanh;

    public Student() {
    }

    public Student(String hoTen, int tuoi, Adress diaChi, double diemLyThuyet, double diemThucHanh) {
        super(hoTen, tuoi, diaChi);
        DiemLyThuyet = diemLyThuyet;
        DiemThucHanh = diemThucHanh;
    }



    public double getDiemLyThuyet() {
        return DiemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        DiemLyThuyet = diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return DiemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        DiemThucHanh = diemThucHanh;
    }

    public double TinhDiemTB(double diemLyThuyet, double diemThucHanh) {
        return (diemLyThuyet + diemThucHanh) / 2;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + DiemLyThuyet + " - " + DiemThucHanh + " - ";
    }
    public void move(){
        System.out.println("Học sinh đang đi về nhà");
    }

}
