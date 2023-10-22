package JavaProgramming.JavaWeek4;

import java.util.ArrayList;

public class Knjizara {

    /*Knjizara
    * - ArrayList<Knjige> knjigeKojeKojeSuNaStanju
    * - ArrayList<Osobe> zaposleni;
    * - ArrayList<Autor> autoreKojeIzdaju; */

    private ArrayList<Knjiga> knjigeKojeSuNaStanju;
    private ArrayList<Osoba> zaposleni;
    private ArrayList<Autor> autoriKnjiga;

    public Knjizara () {
        knjigeKojeSuNaStanju = new ArrayList<>();
        zaposleni = new ArrayList<>();
        autoriKnjiga = new ArrayList<>();
    }

    public ArrayList<Osoba> getZaposleni() {
        return zaposleni;
    }

    public void setZaposleni(ArrayList<Osoba> zaposleni) {
        this.zaposleni = zaposleni;
    }

    public ArrayList<Autor> getAutoriKnjiga () {
        return autoriKnjiga;
    }

    public void setAutoriKnjiga (ArrayList<Autor> autoriKnjiga) {
        this.autoriKnjiga = autoriKnjiga;
    }

}
