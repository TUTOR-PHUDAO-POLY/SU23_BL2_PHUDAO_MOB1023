
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class PhongHocService {
     ArrayList<PhongHoc> list=new ArrayList<>();
    public ArrayList<PhongHoc> getALLPH(){     
        list.add(new PhongHoc("PH1", "Java 2", 45, true));
        list.add(new PhongHoc("PH2", "Java 3", 30, false));
        list.add(new PhongHoc("PH3", "Java 1", 32, true));
        list.add(new PhongHoc("PH4", "Java 4", 33, false));
        return list;
    }
    public String ghiFile(String path){
        //tạo 1 file mới
        File file=new File(path);
        try {
            //kiểm tra sự tồn tại của file
            if(!file.exists()){//file k tồn tại
                file.createNewFile();//tại file mới
            }
            FileOutputStream fos=new FileOutputStream(file);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            //ghi từng đối tượng có trong list vào file
            for (PhongHoc ph : list) {
                oos.writeObject(ph);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return "Ghi file thất bại";
        }
        return "Ghi file thành công";
    }
    public String docFile(String path){
        //tại 1 file mới
        File file=new File(path);
        //kiểm tra sự tồn tại của file
            if(!file.exists()){
                return "File trông tồn tại";
            }
        try {
            FileInputStream fis=new FileInputStream(file);
            ObjectInputStream ois=new ObjectInputStream(fis);
            //add data từ file vào list
            //check xem còn dòng để đọc hay k
            while (fis.available()>0) {//luôn chạy khi còn dòng để đọc                
                list.add((PhongHoc) ois.readObject());
            }
            
        } catch (Exception e) {
            return "Đọc file thất bại";
        }
        return "Đọc file thành công";      
    }
    public void suaPH(int index,PhongHoc ph){
            list.set(index, ph);
        
    }
}
