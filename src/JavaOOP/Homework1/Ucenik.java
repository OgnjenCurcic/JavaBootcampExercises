package JavaOOP.Homework1;

import java.util.ArrayList;

public class Ucenik {

    public String imePrezime;
    public ArrayList<Predmet> predmeti;
    public int godinaSkolovanja;

    public Ucenik() {
        this.predmeti = predmeti;
        this.godinaSkolovanja = godinaSkolovanja;
        this.imePrezime = imePrezime;
    }

    public int getGodinaSkolovanja() {
        return godinaSkolovanja;
    }

    public void setGodinaSkolovanja(int godinaS) {
        this.godinaSkolovanja = godinaS;
    }

    public String getImePrezime() {
        return imePrezime;
    }

    public void setImePrezime(String imePrezime) {
        this.imePrezime = imePrezime;
    }

    public void dodajPredmet(Predmet predmet) {
        predmeti.add(predmet);
    }

    public ArrayList<Predmet> getPredmeti() {
        return predmeti;
    }

    public void setListaPredmeta(ArrayList<Predmet> predmeti) {
        this.predmeti = predmeti;
    }

    public double izracunajProsek() {
        if (predmeti.isEmpty())
            return 0.0;
        int suma = 0;
        for (Predmet predmet : predmeti) {
            suma += predmet.ocena;
        }
        return (double) suma / predmeti.size();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(this.imePrezime + "\n");
        sb.append(this.godinaSkolovanja + "\n");
        for (Predmet p: predmeti){
            sb.append(p.toString() + "\n");
        }
        return sb.toString();
    }

}
