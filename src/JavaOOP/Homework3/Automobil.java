package domaciNedelja6;

import java.util.List;

//Kreirati klasu Automobil koja od atributa ima listu tockova, godiste automobila i cenu.

public abstract class Automobil {
    private List<Tocak> listaTockova;
    private int godisteAutomobila;
    private double cenaAutomobila;
    private String naziv;

    public Automobil(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        this.listaTockova = listaTockova;
        this.godisteAutomobila = godisteAutomobila;
        this.cenaAutomobila = cenaAutomobila;
        this.naziv = "";
    }

    public Automobil(int godisteAutomobila, double cenaAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
        this.cenaAutomobila = cenaAutomobila;
    }

    public Automobil() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public List<Tocak> getListaTockova() {
        return listaTockova;
    }

    public void setListaTockova(List<Tocak> listaTockova) {
        this.listaTockova = listaTockova;
    }

    public int getGodisteAutomobila() {
        return godisteAutomobila;
    }

    public void setGodisteAutomobila(int godisteAutomobila) {
        this.godisteAutomobila = godisteAutomobila;
    }

    public double getCenaAutomobila() {
        return cenaAutomobila;
    }

    public void setCenaAutomobila(double cenaAutomobila) {
        this.cenaAutomobila = cenaAutomobila;
    }

    //Unutar ove klase kreirati metodu:
    //-vratiOstecene(Tocak t) - Proverava da li je dati tocak ostecen, vraca true ako jeste.
    // Tocak od Audi-a je ostecen ukoliko je stariji od 60 dana, dok za BMW i Mercedes za stariji od 100 dana.
    //-cenaTockova() - Vrati cenu svih tockova ako znamo da je cena po tocku za BMW 100, Mercedes
    // 120 i Audi 110.
    //-zameniTocak() - Tocak koji je stariji od granice zameniti novim tockom.

    public abstract boolean vratiOstecene();

    public abstract boolean vratiOstecene(Tocak tocak);

    public abstract void zameniTocak();

    public abstract int cenaTockova();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(godisteAutomobila).append("\n");
        sb.append("Cena automobila je: ").append(cenaAutomobila);
        return sb.toString();
    }

}
