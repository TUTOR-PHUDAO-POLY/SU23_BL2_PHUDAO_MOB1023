
import java.io.Serializable;


public class PhongHoc implements Serializable{// cho phép đọc ghi file
    //thuộc tính id -String, tenPhongHoc -String, dienTich-double,trangThai-boolean (true – phòng trống, false – đang sử dụng)
    private String id;
    private String tenPhongHoc;
    private double dienTich;
    private boolean trangThai;//kiểu dữ liệu nguyên thủy
    //Boolean,Double,Integer.... kiểu lớp bao
    //constructor

    public PhongHoc() {
    }

    public PhongHoc(String id, String tenPhongHoc, double dienTich, boolean trangThai) {
        this.id = id;
        this.tenPhongHoc = tenPhongHoc;
        this.dienTich = dienTich;
        this.trangThai = trangThai;
    }
    //getter and setter

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenPhongHoc() {
        return tenPhongHoc;
    }

    public void setTenPhongHoc(String tenPhongHoc) {
        this.tenPhongHoc = tenPhongHoc;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }
    
}
