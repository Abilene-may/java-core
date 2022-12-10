package bai5.service.phieuyeucau;

import bai5.entity.PhieuYeuCau;
import bai5.entity.SachTruong;
import bai5.service.sachtruong.SachTruongService;

import java.util.Scanner;

public class PhieYeuCauImplement implements PhieuYeuCauService {
    private final SachTruongService sachTruongService;

    public PhieYeuCauImplement( SachTruongService sachTruongService) {
        this.sachTruongService = sachTruongService;
    }

    @Override
    public PhieuYeuCau taoPhieuYeuCau() {
        Scanner sc = new Scanner(System.in);
        PhieuYeuCau phieuYeuCau = new PhieuYeuCau();

        // Tạo phiếu yêu cầu
        // Nhập id
        System.out.print("ID: ");
        long id = sc.nextLong();
        phieuYeuCau.setId(id);

        // Nhập thông tin sách
        SachTruong sachTruong = sachTruongService.themSach();
        phieuYeuCau.setSachTruong(sachTruong);

        // Nhập số lượng sách mượn
        System.out.print("Số lượng sách mượn: ");
        int soLuongMuon = sc.nextInt();
        phieuYeuCau.setSoLuongMuon(soLuongMuon);

        return phieuYeuCau;
    }
}
