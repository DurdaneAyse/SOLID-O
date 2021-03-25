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
public class Kullanici {
    private String mail;
    private String isim;
    private String sifre;
   private KullaniciTipi tip;
    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }

    public KullaniciTipi getTip() {
        return tip;
    }

    public void setTip(KullaniciTipi tip) {
        this.tip = tip;
    }
    
   
}
