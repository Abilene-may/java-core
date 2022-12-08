package Lab4_Inheritance;

import java.util.Scanner;

public class LapTrinhVien extends NhanVien {
    private int HourOverTime;

    public LapTrinhVien(String employeeCode, String name, int age, String phoneNumber, String email, long salary,
            int HourOverTime) {
        super(employeeCode, name, age, phoneNumber, email, salary);
        this.HourOverTime = HourOverTime;
    }

    public LapTrinhVien() {
    }

    @Override
    public long Payroll() {
        long sa = getSalary() + HourOverTime * 200000;
        return sa;
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        super.input();
        System.out.print("So gio overtime: ");
        HourOverTime = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void show() {
        super.show();
        System.out.println(" Number of hours overtime: " + HourOverTime +
                "\n Salary:        " + Payroll());
    }

}
