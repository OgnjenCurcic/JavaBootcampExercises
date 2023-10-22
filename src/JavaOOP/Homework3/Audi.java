package domaciNedelja6;

import java.util.List;

public class Audi extends Automobil{

    public Audi(List<Tocak> listaTockova, int godisteAutomobila, double cenaAutomobila) {
        super(listaTockova, godisteAutomobila, cenaAutomobila);
        super.setNaziv("Audi");
    }

    public Audi(int godisteAutomobila, double cenaAutomobila) {
        super(godisteAutomobila, cenaAutomobila);
        super.setNaziv("Audi");
    }

    public Audi() {
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append(getNaziv()).append(" ").append(super.toString());
        return sb.toString();
    }

    @Override
    public boolean vratiOstecene() {
        boolean daLiJeTocakOstecen = false;
        for(Tocak tocak : getListaTockova()){
            if(tocak.getTrajanjeTocka() > 60){
                return true;
            }
        }
        return daLiJeTocakOstecen;
    }

    @Override
    public boolean vratiOstecene(Tocak tocak) {
        boolean daLiJeTocakOstecen = false;
        if (tocak.getTrajanjeTocka() > 60){
            return true;
        }
        return daLiJeTocakOstecen;
    }

    @Override
    public void zameniTocak() {
        for(Tocak tocak : getListaTockova()){
            if(tocak.getTrajanjeTocka() > 60){
                getListaTockova().remove(tocak);
                Tocak t = new Tocak(0, 110);
                getListaTockova().add(t);
            }
        }
    }

    @Override
    public int cenaTockova() {
        return 4 * 110;
    }

}
