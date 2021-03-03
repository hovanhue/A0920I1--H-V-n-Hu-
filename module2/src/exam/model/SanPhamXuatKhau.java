package exam.model;

import static exam.file.ReadFile.COMA;

public class SanPhamXuatKhau extends SanPham{
    private double giaXuatKhau;
    private String quocGia;

    public double getGiaXuatKhau() {
        return giaXuatKhau;
    }

    public void setGiaXuatKhau(double giaXuatKhau) {
        this.giaXuatKhau = giaXuatKhau;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public SanPhamXuatKhau(String idSanPham, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat, double giaXuatKhau, String quocGia) {
        super(idSanPham, maSanPham, tenSanPham, giaBan, soLuong, nhaSanXuat);
        this.giaXuatKhau = giaXuatKhau;
        this.quocGia = quocGia;
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
                "giaXuatKhau=" + giaXuatKhau +
                ", quocGia='" + quocGia + '\'' +
                '}';
    }

    @Override
    public String hienThiSanPham() {
        return  "\nID San Pham: "+this.getIdSanPham()+
                "\nMa San Pham: "+this.getMaSanPham()+
                "\nTen San Pham: "+this.getTenSanPham()+
                "\nGia Ban: "+this.getGiaBan()+
                "\nSo Luong: "+this.getSoLuong()+
                "\nNha San Xuat: "+this.getNhaSanXuat()+
                "\nGia Nhap Khau: "+this.getGiaXuatKhau()+
                "\nQuoc Gia Nhap San Pham: "+this.getQuocGia();
    }

    public String ghifileCSV(){
        return "ID San Pham: "+this.getIdSanPham()+COMA+
                "Ma San Pham: "+this.getMaSanPham()+COMA+
                "Ten San Pham: "+this.getTenSanPham()+COMA+
                "Gia Ban: "+this.getGiaBan()+COMA+
                "So Luong: "+this.getSoLuong()+COMA+
                "Nha San Xuat: "+this.getNhaSanXuat()+COMA+
                "Gia Nhap Khau: "+this.getGiaXuatKhau()+COMA+
                "Quoc Gia Nhap San Pham: "+this.getQuocGia();
    }
}
