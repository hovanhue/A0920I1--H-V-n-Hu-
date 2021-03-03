package exam.model;

import static exam.file.ReadFile.COMA;

public class SanPhamNhapKhau extends SanPham {
    private double giaNhapKhau;
    private String tinhThanhNhap;
    private double thueNhapKhau;

    public double getGiaNhapKhau() {
        return giaNhapKhau;
    }

    public void setGiaNhapKhau(double giaNhapKhau) {
        this.giaNhapKhau = giaNhapKhau;
    }

    public String getTinhThanhNhap() {
        return tinhThanhNhap;
    }

    public void setTinhThanhNhap(String tinhThanhNhap) {
        this.tinhThanhNhap = tinhThanhNhap;
    }

    public double getThueNhapKhau() {
        return thueNhapKhau;
    }

    public void setThueNhapKhau(double thueNhapKhau) {
        this.thueNhapKhau = thueNhapKhau;
    }
    public SanPhamNhapKhau(){

    }

    public SanPhamNhapKhau(String idSanPham, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, double giaNhapKhau, String tinhThanhNhap, double thueNhapKhau) {
        super(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaNhapKhau = giaNhapKhau;
        this.tinhThanhNhap = tinhThanhNhap;
        this.thueNhapKhau = thueNhapKhau;
    }


    @Override
    public String toString() {
        return "SanPhamXuatKhau{" +
                ", idSanPham='" + idSanPham + '\'' +
                ", maSanPham='" + maSanPham + '\'' +
                ", tenSanPham='" + tenSanPham + '\'' +
                ", giaBan=" + giaBan +
                ", soLuong=" + soLuong +
                ", nhaSanXuat='" + nhaSanXuat + '\'' +
                "giaNhapKhau=" + giaNhapKhau +
                ", tinhThanhNhap='" + tinhThanhNhap + '\'' +
                ", thueNhapKhau=" + thueNhapKhau +
                '}';
    }

    @Override
    public String hienThiSanPham() {
        return "\nSan Pham Xuat Khau: "+
                "\nID San Pham: "+this.getIdSanPham()+
                "\nMa San Pham: "+this.getMaSanPham()+
                "\nTen San Pham: "+this.getTenSanPham()+
                "\nGia Ban: "+this.getGiaBan()+
                "\nSo Luong: "+this.getSoLuong()+
                "\nNha San Xuat: "+this.getNhaSanXuat()+
                "\nGia Nhap Khau: "+this.getGiaNhapKhau()+
                "\nTinh Thanh Nhap: "+this.getTinhThanhNhap()+
                "\nThue Nhap Khau: "+this.getThueNhapKhau();
    }

    public String ghifileCSV(){
        return "ID San Pham: "+this.getIdSanPham()+COMA+
                "Ma San Pham: "+this.getMaSanPham()+COMA+
                "Ten San Pham: "+this.getTenSanPham()+COMA+
                "Gia Ban: "+this.getGiaBan()+COMA+
                "So Luong: "+this.getSoLuong()+COMA+
                "Nha San Xuat: "+this.getNhaSanXuat()+COMA+
                "Gia Nhap Khau: "+this.getGiaNhapKhau()+COMA+
                "Tinh Thanh Nhap: "+this.getTinhThanhNhap()+COMA+
                "Thue Nhap Khau: "+this.getThueNhapKhau();
    }
}
