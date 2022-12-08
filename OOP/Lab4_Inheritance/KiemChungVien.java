package Lab4_Inheritance;

import java.util.Scanner;

public class KiemChungVien extends NhanVien {

    private int NumberOfErrors;

    public KiemChungVien(String employeeCode, String name, int age, String phoneNumber, String email, long salary,
            int NumberOfErrors) {
        super(employeeCode, name, age, phoneNumber, email, salary);
        this.NumberOfErrors = NumberOfErrors;
    }

    public KiemChungVien() {
    }

    @Override
    public long Payroll() {
        long sa = getSalary() + NumberOfErrors * 50000;
        return sa;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("So loi phat hien: ");
        NumberOfErrors = Integer.parseInt(sc.nextLine());
    }

    public void show() {
        super.show();
        System.out.println(" Number of Errors: " + NumberOfErrors +
                "\n Salary:        " + Payroll());

    }

}
