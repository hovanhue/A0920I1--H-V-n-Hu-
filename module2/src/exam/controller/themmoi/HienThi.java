package exam.controller.themmoi;

import exam.controller.main.QuanLiSanPham;
import exam.file.ReadFile;
import exam.model.SanPhamNhapKhau;
import exam.model.SanPhamXuatKhau;

import java.util.Scanner;

import static exam.controller.themmoi.ThemMoi.luaChon;

public class HienThi {
    static Scanner scanner = new Scanner(System.in);

    public static void hienThi() {
        System.out.println("1. Hien thi san pham Nhap khau");
        System.out.println("2. Hien thi san pham Xuat khau");
        System.out.println("3. Quay lai");

        do {
            luaChon = scanner.nextLine();
            if ((Integer.parseInt(luaChon) < 0 || Integer.parseInt(luaChon) > 3)) {
                System.out.println("Vui long chon 1 den 3!");
            }
        } while (Integer.parseInt(luaChon) < 0 || Integer.parseInt(luaChon) > 3);
        switch (luaChon) {
            case "1":
                hienThiNhapKhau();
                break;
            case "2":
                hienThiXuatKhau();
                break;
            case "3":
                QuanLiSanPham.menuSanPham();
                break;
        }
    }

    public static void hienThiNhapKhau() {
        ReadFile.readFileNhapKhau();
        int index = 1;
        if (ReadFile.sanPhamNhapKhauList.isEmpty()) {
            System.out.println("Khong ton tai san pham nao");
        } else {
            for (SanPhamNhapKhau sanPhamNhapKhau : ReadFile.sanPhamNhapKhauList) {
                System.out.println(index++ + ". " + sanPhamNhapKhau.hienThiSanPham());
                System.out.println("------------------------------------\n");
            }
        }
    }

    public static void hienThiXuatKhau() {
        ReadFile.readFileXuatKhau();
        int index = 1;
        if (ReadFile.sanPhamXuatKhauList.isEmpty()) {
            System.out.println("Khong ton tai san pham nao");
        } else {
            for (SanPhamXuatKhau sanPhamXuatKhau : ReadFile.sanPhamXuatKhauList) {
                System.out.println(index++ + ". " + sanPhamXuatKhau.hienThiSanPham());
                System.out.println("------------------------------------\n");
            }
        }
    }
}

