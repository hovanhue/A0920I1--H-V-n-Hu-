package exam.timkiem;

import exam.model.SanPham;

import java.util.ArrayList;
import java.util.List;

import static exam.file.ReadFile.sanPhamList;

public class TimKiem {
    public static List<SanPham> searchContaining(String idSanPham){
        List<SanPham> resultList = new ArrayList<>();
        for (SanPham sanPham: sanPhamList) {
            if(sanPham.getIdSanPham().contains(idSanPham)){
                resultList.add(sanPham);
            }
        }
        return resultList;
    }
}
