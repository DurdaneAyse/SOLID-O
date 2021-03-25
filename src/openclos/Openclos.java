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
public class Openclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Odeme odeme =new Odeme();
        Urun ceptelefonu = new Urun("Cep Telefonu" ,5000);
        Urun bilgisayar = new Urun("pc",7000);
        Kullanici kullanici=new Kullanici();
        Sepet sepet=new Sepet();
        StandartUyelik standartUyelik=new StandartUyelik();
        PremiumUyelik premiumUyelik=new PremiumUyelik();

        
        kullanici.setIsim("Sefa aras");
        kullanici.setMail("sefaaras@ktu.edu.tr");
        kullanici.setSifre("12356");
        kullanici.setTip(premiumUyelik); //indirim oranı ürün sayısı ile ilgili olan kullanıcı tipi oluştur
        
        sepet.urunEkle(ceptelefonu);
        sepet.urunEkle(bilgisayar);
        
        System.out.println(odeme.fiyathesapla(kullanici, sepet));
                

        
    }
    
}
