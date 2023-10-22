package domaciNedelja6;

import java.util.List;

public class Salon {

    /*Napraviti klasu Salon koja ima samo listu Automobila i metode za:
    Klase Audi, BMW i Mercedes nasledjuju klasu Automobil.*/

    private List<Automobil> listaAutomobila;

    public Salon(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    public List<Automobil> getListaAutomobila() {
        return listaAutomobila;
    }

    public void setListaAutomobila(List<Automobil> listaAutomobila) {
        this.listaAutomobila = listaAutomobila;
    }

    public Salon(){
    }

    //-vratiNajstariji() - koja ce vratiti najstariji automobil po godistu.
    //-vratiNajskuplji() - vraca najskuplji auto

    public Automobil vratiNajstariji() {
        int najnizeGodiste = 2023;
        Automobil automobil = null;
        for (Automobil auto : listaAutomobila) {
            int godisteAutomobila = auto.getGodisteAutomobila();
            if (godisteAutomobila < najnizeGodiste) {
                najnizeGodiste = godisteAutomobila;
                automobil = auto;
            }
        }
        return automobil;
    }

    public Automobil vratiNajskuplji() {
        double najvecaCena = 0;
        Automobil najskupljiAutomobil = null;

        for(Automobil auto : listaAutomobila) {
            double cenaAutomobila = auto.getCenaAutomobila();
            if (cenaAutomobila > najvecaCena) {
                najvecaCena = cenaAutomobila;
                najskupljiAutomobil = auto;
            }
        }
        return najskupljiAutomobil;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Automobil auto : listaAutomobila) {
            sb.append(auto.toString()).append("\n");
        }
        return sb.toString();
    }

}
