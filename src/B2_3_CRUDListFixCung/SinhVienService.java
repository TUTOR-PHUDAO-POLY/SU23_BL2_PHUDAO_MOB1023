package B2_3_CRUDListFixCung;

import java.util.ArrayList;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Phanh
 */
public class SinhVienService {

    private ArrayList<SinhVien> list = new ArrayList<>();

    public ArrayList<SinhVien> getAll() {
        list.add(new SinhVien("SV1", "Nguyễn Văn A", 18, "Hà Nội", true));
        list.add(new SinhVien("SV2", "Nguyễn Văn Tèo", 17, "Hà Nội", true));
        list.add(new SinhVien("SV3", "Nguyễn Thị C", 15, "HCM", false));
        list.add(new SinhVien("SV4", "Nguyễn Thị Mai", 16, "Hà Nội", false));
        list.add(new SinhVien("SV5", "Nguyễn Quang B", 16, "HCM", true));
        return list;
    }
}
