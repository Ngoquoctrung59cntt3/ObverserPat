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
public class TiGia //Subject
{
    float tigia;
    List<LangNgheThayDoiTiGia> khs = new ArrayList<>();

    public TiGia(float tigia) {
        this.tigia = tigia;
    }
    
    
    public void them(LangNgheThayDoiTiGia kh)
    {
        if(khs.contains(kh))
            khs.add(kh);
    }
    public void xoa(LangNgheThayDoiTiGia kh)
    {
        khs.remove(kh);
    }
    public void thayDoiTiGia(float khoangTD)
    {
        tigia += khoangTD;
        khs.forEach(kh ->
        {
            kh.capNhatTiGia(tigia);
        });
    }
    
    public static interface LangNgheThayDoiTiGia
    {
        public void capNhatTiGia(float tigiaMoi);
    }
}
