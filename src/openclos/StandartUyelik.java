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
public class StandartUyelik extends KullaniciTipi{
     @Override
    public double indirimliTutar(double fiyat) {
        return fiyat;
    }
}
