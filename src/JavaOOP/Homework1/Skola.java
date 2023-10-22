package JavaOOP.Homework1;

import java.util.ArrayList;

public class Skola {

    private ArrayList<Ucenik> ucenici;

    public Skola() {
    }

    public Skola(ArrayList<Ucenik> listaUcenika) {
        this.ucenici = ucenici;
    }

    public ArrayList<Ucenik> getUcenici() {
        return ucenici;
    }

    public void setUcenici(ArrayList<Ucenik> ucenici) {
        this.ucenici = ucenici;
    }

    public String toString (){
        StringBuilder sb = new StringBuilder();
        for (Ucenik u: ucenici){
            sb.append(u.getImePrezime() + "\n");
        }
        return sb.toString();
    }

    public double prosekUcenikaTeGodine (int godina){
        double prosek = 0.0;
        double zbirProsekaSvihUcenika = 0.0;
        int brojUcenikaTeGodine = 0;
        for (Ucenik u: ucenici){
            if(u.getGodinaSkolovanja() == godina){
                zbirProsekaSvihUcenika += u.izracunajProsek();
                brojUcenikaTeGodine++;
            }
        }
        prosek = zbirProsekaSvihUcenika / brojUcenikaTeGodine;
        return prosek;
    }

    public double prosekUcenikaIstogPredmeta (Predmet predmet){
        double prosek = 0.0;
        double zbirProsekaSvihUcenikaDatogPredmeta = 0.0;
        int brojUcenikaDatogPredmeta = 0;
        for (Ucenik u: ucenici){
            if(u.predmeti.contains(predmet.getNazivPredmeta())){
                zbirProsekaSvihUcenikaDatogPredmeta += u.izracunajProsek();
                brojUcenikaDatogPredmeta++;
            }
        }
        prosek = zbirProsekaSvihUcenikaDatogPredmeta / brojUcenikaDatogPredmeta;
        return prosek;
    }

    public Ucenik ucenikSaNajmanjimProsekom (){

        Ucenik ucenikSaNajmanjimProsekom = new Ucenik();
        double najmanjiProsek = Double.POSITIVE_INFINITY;
        for (Ucenik u: ucenici){
            if(u.izracunajProsek() < najmanjiProsek){
                najmanjiProsek = u.izracunajProsek();
                ucenikSaNajmanjimProsekom = u;
            }
        }
        return ucenikSaNajmanjimProsekom;
    }

}
