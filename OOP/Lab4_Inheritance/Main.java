package Lab4_Inheritance;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("So luong lap trinh vien: ");
        int x = Integer.parseInt(sc.nextLine());
        System.out.print("So luong kiem chung vien: ");
        int y = Integer.parseInt(sc.nextLine());

        NhanVien[] ltv = new LapTrinhVien[x];
        NhanVien[] kcv = new KiemChungVien[y];

        System.out.println("=== LAP TRINH VIEN ===");
        for (int i = 0; i < x; i++) {
            ltv[i] = new LapTrinhVien();
            ltv[i].input();

        }

        System.out.println("=== KIEM CHUNG VIEN ===");
        for (int i = 0; i < x; i++) {
            kcv[i] = new KiemChungVien();
            kcv[i].input();
        }

        // In ra danh sach cac nhan vien
        System.out.println("\n \n=== DANH SACH LAP TRINH VIEN ===");
        for (int i = 0; i < x; i++) {
            ltv[i].show();
        }

        System.out.println("\n=== DANH SACH KIEM CHUNG VIEN ===");
        for (int i = 0; i < y; i++) {
            kcv[i].show();
        }

    }
}
