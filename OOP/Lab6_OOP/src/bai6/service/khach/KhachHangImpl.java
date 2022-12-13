package bai6.service.khach;
import bai6.entity.KhachHang;

import java.util.Scanner;

public class KhachHangImpl implements KhachHangService {
    @Override
    public KhachHang taoKhachHangbai6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Họ và tên: ");
        String tenKhach = sc.nextLine();
        return new KhachHang(tenKhach);
    }
}
