package exam.controller.main;

import exam.controller.themmoi.HienThi;
import exam.controller.themmoi.ThemMoi;
import exam.controller.xoa.Xoa;
import exam.model.SanPham;
import exam.timkiem.TimKiem;

import java.util.Scanner;

public class QuanLiSanPham {
    static Scanner scanner = new Scanner(System.in);
    static String luaChon;

    public static void menuSanPham(){
        System.out.println("---------------------------------------------");
        System.out.println("- CHọn chức năng theo số (để tiếp tục)      -");
        System.out.println("-1. Thêm mới                                -");
        System.out.println("-2. Xóa                                     -");
        System.out.println("-3. Xem danh sách các sản phẩm              -");
        System.out.println("-4. Tìm kiếm                                -");
        System.out.println("-5. Thoát                                   -");
        System.out.println("---------------------------------------------");
        System.out.print("Chọn chức năng: ");
        //do while
        do {
            luaChon = scanner.nextLine();
            switch (luaChon) {
                case "1":
                    ThemMoi.themMoiSanPham();
                    break;
                case "2":
                    String idTam;
                    System.out.println("Nhap id san pham can xoa: ");
                    idTam = scanner.nextLine();
                    Xoa.xoaSanPham(new SanPham(idTam) {
                        @Override
                        public String hienThiSanPham() {
                            return null;
                        }
                    });
                    break;
                case "3":
                    HienThi.hienThi();
                    menuSanPham();
                    break;
                case "4":
                    String id;
                    System.out.println("Nhap id san pham can tim: ");
                    id = scanner.nextLine();
                    System.out.println(TimKiem.searchContaining(id));
                    break;
                case "5":
                    System.exit(0);
            }
        }while (Integer.parseInt(luaChon) < 0 || Integer.parseInt(luaChon) > 5) ;

    }

    public static void main(String[] args) {
        menuSanPham();
    }
}
