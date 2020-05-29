/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Trung_PC
 */
public class NhaDauTuA implements TiGia.LangNgheThayDoiTiGia{

    float tigia;
    TiGia dichvu;
    public NhaDauTuA(float tigia)
    {
        this.tigia = tigia;
    }
    public void dangKy(TiGia tiGia)
    {
        tiGia.them(this);
    }
    public void huyDK(TiGia tiGia)
    {
        tiGia.xoa(this);
    }
    @Override
    public void capNhatTiGia(float tigiaMoi) {
        
        if(tigiaMoi > tigia)
            System.out.println("Nha dau tu A: ban ra");
        
    
        else
           if(tigiaMoi == tigia)
            System.out.println("Nha dau tu A: mua vao");
        else
           
            System.out.println("Nha dau tu A: ban ra");
        tigia = tigiaMoi;
        
    
}}
