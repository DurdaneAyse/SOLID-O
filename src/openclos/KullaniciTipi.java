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
public abstract class KullaniciTipi {
    public static int STANDART =0;//kariştirmamak için değer atadık çağırdığımızda karşımıza standart veya prremıum olarak gelecek.. 
    public static int PREMIUM =1;
    
    public abstract double indirimliTutar(double fiyat); {
    
}  
}
