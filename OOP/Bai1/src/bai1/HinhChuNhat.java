package bai1;

public class HinhChuNhat {
    private double length;
    private double width;

    public HinhChuNhat() {
    }

    public HinhChuNhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double ChuVi(){
        return (length + width ) * 2;
    }
    public double DienTich() {
        return length * width;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "length=" + length +
                ", width=" + width +
                "} + \n";
    }
}


