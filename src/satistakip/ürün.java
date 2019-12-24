/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package satistakip;

/**
 *
 * @author ardakaynar
 */
public class ürün {
    private String ürün_adı;
    private String kategori;
    private String aciklama;
    private String fiyat;

    public ürün(String ürün_adı, String kategori, String aciklama, String fiyat) {
        this.ürün_adı = ürün_adı;
        this.kategori = kategori;
        this.aciklama = aciklama;
        this.fiyat = fiyat;
    }

    public String getÜrün_adı() {
        return ürün_adı;
    }

    public void setÜrün_adı(String ürün_adı) {
        this.ürün_adı = ürün_adı;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }
}
