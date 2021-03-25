/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclos;

import java.util.ArrayList;

/**
 *
 * @author AYŞE
 */
public class Sepet {
    private ArrayList<Urun> urunler;
    public Sepet(){
        urunler=new ArrayList<Urun>();
    }
    public void urunEkle(Urun urun){
    urunler.add(urun);
    }    
    
    public double tutar(){
        double tutar=0;
        for (Urun urun: urunler){
            tutar +=urun.getFiyat();
            
        }
        return tutar;
    }
}
