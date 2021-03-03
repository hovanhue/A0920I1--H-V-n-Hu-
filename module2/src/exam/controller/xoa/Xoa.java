package exam.controller.xoa;

import exam.model.SanPham;

import java.util.Collections;

import static exam.file.ReadFile.sanPhamList;

public class Xoa {

    public static void xoaSanPham(SanPham sanPham) {
        int vitri = sanPhamList.indexOf(sanPham);
        if (vitri == -1) {
            System.out.println("ID " + sanPham.getIdSanPham() + " nay khong ton tai!");
            return;
        } else {
            sanPhamList.remove(vitri);
        }

    }
}
