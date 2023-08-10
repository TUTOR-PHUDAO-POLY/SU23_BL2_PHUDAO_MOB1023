
import java.io.Serializable;
import java.time.LocalDate;


public class SinhVien implements Serializable{//để cho phép đọc ghi file
    private String maSV;
    private String tenSV;
    private String gioiTinh;
    private Integer namSinh;
    //constructor

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, String gioiTinh, Integer namSinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
    }
    //getter and setter

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public Integer getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }
    //phương thức tính tuổi
    public Integer tinhTuoi(Integer namSinh){
        LocalDate ld=LocalDate.now();
        int year=ld.getYear();
        return Integer.valueOf(year)-namSinh;
    }
}
