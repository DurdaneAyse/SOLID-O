/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package openclos;

/**
 *
 * @author AYŞE
 */
public class Odeme {
    public double fiyathesapla( Kullanici kullanici, Sepet sepet){
            return kullanici.getTip().indirimliTutar(sepet.tutar());
       
        
        
    }
    
}
