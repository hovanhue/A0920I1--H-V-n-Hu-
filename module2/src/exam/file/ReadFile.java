package exam.file;

import exam.model.SanPham;
import exam.model.SanPhamNhapKhau;
import exam.model.SanPhamXuatKhau;

import java.util.ArrayList;
import java.util.List;

import static exam.file.GhiFile.readFromFile;

public class ReadFile {
    public static List<SanPham> sanPhamList = new ArrayList<>();
    public static final String COMA = ",";
    public static List<SanPhamXuatKhau> sanPhamXuatKhauList;
    public static List<SanPhamNhapKhau> sanPhamNhapKhauList;

    public static void readFileNhapKhau() {
        sanPhamNhapKhauList = new ArrayList<>();
        List<String> stringList = readFromFile("D:\\A0920I- HoVanHue\\module2\\src\\exam\\data\\nhapkhau.csv");
        String[] stringSplit;
        for (String string : stringList) {
            stringSplit = string.split(",");
            SanPhamNhapKhau villa = new SanPhamNhapKhau(stringSplit[0], stringSplit[1], stringSplit[2],
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], Double.parseDouble(stringSplit[6]), stringSplit[7],
                    Double.parseDouble(stringSplit[8]));
            sanPhamNhapKhauList.add(villa);

        }

    }

    public static void readFileXuatKhau() {
        sanPhamXuatKhauList = new ArrayList<>();
        List<String> stringList = readFromFile("D:\\A0920I- HoVanHue\\module2\\src\\exam\\data\\xuatkhau.csv");
        String[] stringSplit;
        for (String string : stringList) {
            stringSplit = string.split(",");
            SanPhamXuatKhau villa = new SanPhamXuatKhau(stringSplit[0], stringSplit[1], stringSplit[2],
                    Double.parseDouble(stringSplit[3]), Integer.parseInt(stringSplit[4]),
                    stringSplit[5], Double.parseDouble(stringSplit[6]), stringSplit[7]);
            sanPhamXuatKhauList.add(villa);

        }

    }

}
