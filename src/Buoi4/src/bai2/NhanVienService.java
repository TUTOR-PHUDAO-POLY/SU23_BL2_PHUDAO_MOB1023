package bai2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NhanVienService {

    private ArrayList<NhanVien> list = new ArrayList<>();

    public ArrayList<NhanVien> getAllNV() {
        list.add(new NhanVien("NV1", "Nguyễn Văn A", 18, 50, "HN", 0));
        list.add(new NhanVien("NV2", "Nguyễn Thị Mai", 17, 45, "HN", 1));
        list.add(new NhanVien("NV3", "Nguyễn Tùng D", 20, 55, "HN", 0));
        list.add(new NhanVien("NV4", "Nguyễn Văn B", 18, 50, "HCM", 0));
        return list;
    }

    public String ghiFile(String path) {
        //tạo 1 file mới
        File file = new File(path);
        try {
            //kiểm tra sự tồn tại của file
            if (!file.exists()) {
                file.createNewFile();
            }
            try ( FileOutputStream fos = new FileOutputStream(file)) {
                ObjectOutputStream oos = new ObjectOutputStream(fos);
                //ghi từng đối tượng vào file
                for (NhanVien nv : list) {
                    oos.writeObject(nv);
                }

            } catch (Exception e) {
                return "Ghi file thất bại";
            }

        } catch (Exception e) {
            return "Ghi file thất bại";
        }
        return "Ghi file thành công";
    }

    public String docFile(String path) {
        //tạo 1 file mới
        File file = new File(path);
        //kiểm tra sự tồn tại của file
        if (!file.exists()) {
            return "File không tồn tại";
        }
        try {
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            //add data từ file vào list
            //check xem còn dòng để đọc hay k
            while (fis.available()>0) {                
                list.add((NhanVien) ois.readObject());
            }
        } catch (Exception ex) {
            return "Đọc file thất bại";
        } 
        return "Đọc file thành công";
    }
}
