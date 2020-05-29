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
public class NhaDauTuB implements TiGia.LangNgheThayDoiTiGia{
     float tigia;
     TiGia dichVu;
     public NhaDauTuB(float tigia)
     {
         this.tigia = tigia;
     }       

    
     public void dangKy(TiGia tiGia)
     {
         tiGia.them(this);
     }
     public void huyDangKy(TiGia tiGia)
     {
         tiGia.xoa(this);
     }

    public void capNhatTiGia(float tigiaMoi) {
        {
            if(tigiaMoi > tigia){
                System.out.println("Nha dau tu B: ban ra");
         
        }
            else 
                if(tigiaMoi == tigia)
                System.out.println("Nha dau tu B: mua vao");
            else
                 System.out.println("Nha dau tu B:ban ra");
            tigia = tigiaMoi;
        }
    }
    
}
