package Lab4_Inheritance;

import java.util.Scanner;
import java.util.regex.Pattern;

public abstract class NhanVien {
    private String EmployeeCode;
    private String Name;
    private int Age;
    private String PhoneNumber;
    private String email;
    private long Salary;
    //regex
    String EMAIL_PATTERN =
    "^[a-zA-Z][\\w-] + @([\\w] + \\.[\\w] + |\\.[\\w]{2,}\\.[\\w]{2,})$";

    public NhanVien() {
    }

    public String getEmployeeCode() {
        return EmployeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        EmployeeCode = employeeCode;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public long getSalary() {
        return Salary;
    }

    public void setSalary(long salary) {
        Salary = salary;
    }

    public NhanVien(String employeeCode, String name, int age, String phoneNumber, String email, long salary) {
        EmployeeCode = employeeCode;
        Name = name;
        Age = age;
        PhoneNumber = phoneNumber;
        this.email = email;
        Salary = salary;
    }

    abstract public long Payroll();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma nhan vien: ");
        this.EmployeeCode = sc.nextLine();

        System.out.print("Ho ten: ");
        this.Name = sc.nextLine();

        System.out.print("Tuoi: ");
        this.Age = Integer.parseInt(sc.nextLine());

        System.out.print("So dien thoai: ");
        this.PhoneNumber = sc.nextLine();

        System.out.print("Email: ");
        email = sc.nextLine();
        while(Pattern.matches(email, EMAIL_PATTERN) == false){
            System.out.println("This email is invalid. Please re -enter!");
            System.out.print("Email: ");
            email = sc.nextLine();
        }

        System.out.print("Luong co ban: ");
        this.Salary = Integer.parseInt(sc.nextLine());
    }

    public void show() {
        System.out.println(" Employee code: " + EmployeeCode +
                "\n Name:           " + Name +
                "\n Phone Number:   " + PhoneNumber +
                "\n Email:          " + email +
                "\n Basic Salary:   " + Salary);
    }

    private class String {
    }
}
