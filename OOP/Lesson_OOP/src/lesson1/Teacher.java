package lesson1;

public class Teacher extends Person{
    private long luong;

    public Teacher() {
    }

    public Teacher(String hoTen, int tuoi, Adress diaChi, long luong) {
        super(hoTen, tuoi, diaChi);
        this.luong = luong;
    }

    public long getLuong() {
        return luong;
    }

    public void setLuong(long luong) {
        this.luong = luong;
    }

    @Override
    public String toString() {
        return super.toString() + "Teacher{" +
                "luong=" + luong +
                '}';
    }

    @Override
    public void study() {
        super.study();
        System.out.println("Hoc toan");

    }
}
