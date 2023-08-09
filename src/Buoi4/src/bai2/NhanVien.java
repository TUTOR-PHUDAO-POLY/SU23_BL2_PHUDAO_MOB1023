
package bai2;

import java.io.Serializable;


public class NhanVien implements Serializable{
    //ma - String, ten- String , tuoi - int, canNang - int, diaChi - String, bac - int
    private String ma;
    private String ten;
    private int tuoi;
    private int  canNang;
    private String  diaChi;
    private int  bac;
    //constructor

    public NhanVien() {
    }

    public NhanVien(String ma, String ten, int tuoi, int canNang, String diaChi, int bac) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.canNang = canNang;
        this.diaChi = diaChi;
        this.bac = bac;
    }
    //getter and setter

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getCanNang() {
        return canNang;
    }

    public void setCanNang(int canNang) {
        this.canNang = canNang;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }
    
}
