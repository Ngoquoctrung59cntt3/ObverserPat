/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Trung_PC
 */
public class TiGia {
    float tiGia;
    List<LangNgheThayDoiTiGia> khachHangs = new ArrayList<>();
    public TiGia(float tiGia) {
        this.tiGia = tiGia;
    }
    public void them(LangNgheThayDoiTiGia kh) {
        if(!khachHangs.contains(kh)) {
            khachHangs.add(kh);
        }
    }
    public void xoa(LangNgheThayDoiTiGia kh) {
        khachHangs.remove(kh);
    }
    public void thayDoiTiGia(float khoangThayDoi) {
        tiGia = tiGia + khoangThayDoi;
        khachHangs.forEach(kh ->{
            kh.capNhatTiGia(tiGia);
        });
    }
    public static interface LangNgheThayDoiTiGia {
        public void capNhatTiGia(float tiGiaMoi);
    }
}
