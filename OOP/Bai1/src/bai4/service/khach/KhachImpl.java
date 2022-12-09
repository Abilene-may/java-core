package bai4.service.khach;

import bai4.entity.Customer;

import java.util.Scanner;

public class KhachImpl  implements  KhachService{

    @Override
    public Customer taoKhachHang() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten: ");
        String ten = sc.nextLine();
        System.out.print("Dia chi: ");
        String diaChi = sc.nextLine();
        return new Customer(ten, diaChi);
    }
}
