/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import java.util.Scanner;

/**
 *
 * @author Trung_PC
 */
public class Observer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TiGia tg = new TiGia(100);
        NhaDauTuA a = new NhaDauTuA(100);
        NhaDauTuB b = new NhaDauTuB(100);
        a.dangKy(tg);
        b.dangKy(tg);
        while(true)
        {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap khoang thay doi ti gia: ");
            float f = scanner.nextFloat();
            tg.thayDoiTiGia(f);
            System.out.println("Tiep tuc yes/no");
            String kt = scanner.next();
            if(kt.equalsIgnoreCase("no"))
                break;
        }
    }
    
}
