package exam.controller.themmoi;

import exam.controller.main.QuanLiSanPham;
import exam.file.GhiFile;
import exam.model.SanPhamNhapKhau;
import exam.model.SanPhamXuatKhau;

import java.util.Scanner;

import static exam.file.ReadFile.sanPhamList;

public class ThemMoi {
    static Scanner scanner = new Scanner(System.in);
    static String luaChon;
    static String idSanPham;
    static String maSanPham;
    static String tenSanPham;
    static double giaBan;
    static int soLuong;
    static String nhaSanXuat;

    public static void themMoiSanPham() {
        System.out.println("1. Nhap khau");
        System.out.println("2. Xuat khau");
        System.out.println("3. Quay lai");

        do {
            luaChon = scanner.nextLine();
            if ((Integer.parseInt(luaChon) < 0 || Integer.parseInt(luaChon) > 3)) {
                System.out.println("Vui long chon 1 den 3!");
            }
        } while (Integer.parseInt(luaChon) < 0 || Integer.parseInt(luaChon) > 3);
        switch (luaChon) {
            case "1":
                themSanPhamNhapKhau();
                break;
            case "2":
                themSanPhamXuatKhau();
                break;
            case "3":
                QuanLiSanPham.menuSanPham();
                break;
        }
    }

    public static void themSanPham() {
        System.out.print("Nhap id san pham: ");
        idSanPham = scanner.nextLine();
        System.out.print("Nhap ma san pham: ");
        maSanPham = scanner.nextLine();
        System.out.print("Nhap ten san pham: ");
        tenSanPham = scanner.nextLine();

        System.out.print("Nhap gia ban san pham: ");
        giaBan = scanner.nextDouble();
        System.out.print("Nhap so luong san pham: ");
        soLuong = scanner.nextInt();

        System.out.print("Nhap nha san xuat san pham: ");
        nhaSanXuat = scanner.nextLine();

    }

    public static void themSanPhamNhapKhau() {
        String giaNhapKhau;
          String tinhThanhNhap;
        String thueNhapKhau;

        themSanPham();
        System.out.print("Nhap gia xuat khau: ");
        giaNhapKhau = scanner.nextLine();
        System.out.println("Nhap tinh thanh nhap khau: ");
        tinhThanhNhap = scanner.nextLine();
        System.out.print("Nhap thue xuat khau: ");
        thueNhapKhau = scanner.nextLine();
        SanPhamNhapKhau sanPhamNhapKhau = new SanPhamNhapKhau(idSanPham, maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,
                Double.parseDouble(giaNhapKhau),tinhThanhNhap,Double.parseDouble(thueNhapKhau));
        sanPhamList.add(sanPhamNhapKhau);
        String line = sanPhamNhapKhau.ghifileCSV();
        GhiFile.ghiFileCSV("D:\\A0920I- HoVanHue\\module2\\src\\exam\\data\\nhapkhau.csv",line);
        System.out.println("Đã thêm thành công!!");
    }

    public static void themSanPhamXuatKhau() {
        double giaXuatKhau;
        String quocGia;
        themSanPham();
        scanner.next();
        System.out.print("Nhap gia xuat khau: ");
        giaXuatKhau = scanner.nextDouble();
        System.out.println("Nhap quoc gia nhap khau: ");
        quocGia = scanner.nextLine();
        SanPhamXuatKhau sanPhamXuatKhau = new SanPhamXuatKhau(idSanPham, maSanPham,tenSanPham,giaBan,soLuong,nhaSanXuat,giaXuatKhau,quocGia);
//        sanPhamList.add(sanPhamXuatKhau);
        String line = sanPhamXuatKhau.ghifileCSV();
        GhiFile.ghiFileCSV("D:\\A0920I- HoVanHue\\module2\\src\\exam\\data\\xuatkhau.csv",line);
        System.out.println("Đã thêm thành công!!");
    }


}
