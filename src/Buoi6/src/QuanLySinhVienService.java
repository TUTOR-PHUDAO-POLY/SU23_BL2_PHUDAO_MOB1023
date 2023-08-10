
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class QuanLySinhVienService {
    List<SinhVien> list=new ArrayList<>();
    public List<SinhVien> getALLSV(){
        list.add(new SinhVien("SV1", "Nguyễn Văn A", "Nam", 2000));
        list.add(new SinhVien("SV2", "Nguyễn Thị Mai", "Nữ", 2000));
        list.add(new SinhVien("SV3", "Nguyễn Chí Phèo", "Nam", 2002));
        list.add(new SinhVien("SV4", "Nguyễn Cao B", "Nam", 2003));
        list.add(new SinhVien("SV5", "Nguyễn Thị C", "Nữ", 2004));
        return list;
    }
    public void deleteSV(int row){
        list.remove(row);//xóa theo dòng được chọn
    }
    public String ghiFile(String path){
        //tạo ra 1 file mới
        File file=new File(path);
        try {
            //kiểm tra xem file có tồn tại hay k
            if(!file.exists()){//file k tồn tại
                file.createNewFile();//tạo file mới
            }
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //ghi từng đối tượng có trong list vào file
            for (SinhVien sinhVien : list) {
                oos.writeObject(sinhVien);
            }
        } catch (Exception e) {
            return "Ghi file thất bại";
        }
        return "Ghi file thành công";
    }
    public String docFile(String path){
        //tạo ra 1 file mới
        File file=new File(path);
        //kiểm tra sự tồn tại của file
        if(!file.exists()){//nếu file k tồn tại
            return "File không tồn tại";
        }
        try {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            //add data từ file vào list
            //check xem còn dòng để đọc hay k
            while (fis.available()>0) {                
                list.add((SinhVien) ois.readObject());
            }
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
        return "Đọc file thành công";
    }
}
