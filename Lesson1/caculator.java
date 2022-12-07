package Lesson1;

public class caculator {
    public static void caculatorBMI() {
        float weight = 48, height = (float)1.57;
        float BMI = weight/(height*height);
        System.out.println("BMI kieu void = "+ BMI);

    }
    public static double caculator2BMI(){
        double weight = 48, height = (double)1.57;
        double BMI = weight/(height*height);
        return BMI;  
    }
    public static double caculator3BMI(double w, double h) {
        double BMI = w/(h*h);
        return BMI; 
    }

    public static void main(String[] args) {
        float a = 10, b = 3;
        System.out.println("a + b = " + (a+b));
        System.out.println("a - b = " + (a-b));
        System.out.println("a * b = " + (a*b));
        System.out.println("a / b = " + (a/b));

        caculatorBMI();
        System.out.println("BMI kieu double: " +caculator2BMI()); 
        System.out.println("BMI co truyen tham so: " +caculator3BMI(47, 1.57)); 

    }
}
/* 
Câu 1: Viết chương trình thực hiện tạo class Calculator, trong class này viết 4 phương thức thực hiện các phép tính:

Cộng 2 số
Trừ 2 số
Nhân 2 số
Chia 2 số
Câu 2: Viết chương trình tính chỉ số BMI

Công thức tính: cân nặng/ (chiều cao * chiều cao)

Với chiều cao đo bằng met và cân nặng là kg

Thực hiện:

Viết phương thức tính BMI có kiểu trả về là void
Viết phương thức tính BMI có kiểu trả về là double
Viết phương thức tính BMI có kiểu trả về là double và có truyền tham số
So sánh sử dụng phương thức nào là tốt nhất
*/