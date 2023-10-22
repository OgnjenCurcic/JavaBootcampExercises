package Domaci;

import java.util.ArrayList;

public class Predmet {

    public String nazivPredmeta;
    public int ocena;

    public Predmet(String nazivPredmeta, int ocena) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
    }

    public Predmet() {
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public String getListaPredmeta(String predmeti){
        return predmeti;
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.nazivPredmeta  + ": ").append(this.ocena+ "\n");

        return sb.toString();
    }

}
