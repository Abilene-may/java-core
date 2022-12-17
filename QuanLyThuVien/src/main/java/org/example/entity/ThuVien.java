package org.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ThuVien {
    private List<SachGiaoKhoa> sachGiaoKhoaList;
    private List<TapChi> tapChiList;
    private List<TaiLieuDienTu> taiLieuDienTuList;

}
