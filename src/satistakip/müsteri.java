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
public class müsteri {
    private String name;
    private String telefon;
    private String e_posta;
    private String cinsiyet;

    public müsteri(String name, String telefon, String e_posta, String cinsiyet) {
        this.name = name;
        this.telefon = telefon;
        this.e_posta = e_posta;
        this.cinsiyet = cinsiyet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getE_posta() {
        return e_posta;
    }

    public void setE_posta(String e_posta) {
        this.e_posta = e_posta;
    }

    public String getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
