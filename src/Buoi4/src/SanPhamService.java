
import java.util.ArrayList;


public class SanPhamService {
    //khai báo mảng chứa thông tin sản phẩm
    private ArrayList<SanPham> list=new ArrayList<>();
    //các chức năng
    public ArrayList<SanPham> getAllSP(){
        list.add(new SanPham("SP1", "Mì gói", 100, "Nhập khẩu"));
        list.add(new SanPham("SP2", "Mì hộp", 200, "Nhập khẩu"));
        list.add(new SanPham("SP3", "Snack", 100, "Xuất khẩu"));
        list.add(new SanPham("SP4", "Khoai lang", 100, "Xuất khẩu"));
        list.add(new SanPham("SP5", "Rau cải", 100, "Xuất khẩu"));
        return list;
    }
    public String addSP(SanPham sp){
        if(sp!=null){
            list.add(sp);
            return "Thêm sản phẩm thành công";
        }
        return "Thêm thất bại";
    }
    public String updateSP(int index,SanPham sp){
        if(sp!=null){
            list.set(index, sp);
            return "Sửa thành công";
        }
        return "Sửa thất bại";
    }
    public void xoaSP(int index){
        list.remove(index);
    }
}
