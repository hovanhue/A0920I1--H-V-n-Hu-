package exam.model;

public abstract class SanPham {
    protected String idSanPham;
    protected String maSanPham;
    protected String tenSanPham;
    protected double giaBan;
    protected int soLuong;
    protected String nhaSanXuat;

    public String getIdSanPham() {
        return idSanPham;
    }

    public void setIdSanPham(String idSanPham) {
        this.idSanPham = idSanPham;
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public double getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public SanPham(){

    }
public SanPham(String id){
        this.idSanPham = id;
}
    public SanPham(String idSanPham, String maSanPham, String tenSanPham, double giaBan, int soLuong, String nhaSanXuat) {
        this.idSanPham = idSanPham;
        this.maSanPham = maSanPham;
        this.tenSanPham = tenSanPham;
        this.giaBan = giaBan;
        this.soLuong = soLuong;
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public String toString() {
        return "San Pham{" +
                "Id San Pham='" + idSanPham + '\'' +
                ", Ma San Pham='" + maSanPham + '\'' +
                ", Ten San Pham='" + tenSanPham + '\'' +
                ", Gia Ban=" + giaBan +
                ", So Luong=" + soLuong +
                ", Nha San Xuat='" + nhaSanXuat + '\'' +
                '}';
    }

    public abstract String hienThiSanPham();

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof SanPham)){
            return false;
        }

        SanPham sanPham = (SanPham) obj;

        if(this.idSanPham.equals(sanPham.getIdSanPham())){
            return true;
        }
        return false;
    }
}
