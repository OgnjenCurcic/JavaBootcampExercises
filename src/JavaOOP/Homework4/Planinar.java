package domaciNedelja7;

import java.util.ArrayList;
import java.util.List;

public abstract class Planinar {

    private String imePlaninara;
    private int maxVisina;
    private List<Planina> listaPlanina;


    public Planinar(String imePlaninara, int maxVisina) {
        this.imePlaninara = imePlaninara;
        this.maxVisina = maxVisina;
        this.listaPlanina = new ArrayList<>();
    }

    public String getIme() {
        return imePlaninara;
    }

    public void setIme(String ime) {
        this.imePlaninara = imePlaninara;
    }

    public List<Planina> getListaPlanina() {
        return listaPlanina;
    }

    public void setListaPlanina(List<Planina> listaPlanina) {
        this.listaPlanina = listaPlanina;
    }

    public int getMaxVisina() {
        return maxVisina;
    }

    public void setMaxVisina(int maxVisina) {
        this.maxVisina = maxVisina;
    }

    public abstract void popniSe(Planina p);

    public List<Planina> crnaLista() {
        List<Planina> crnePlanine = new ArrayList<>();
        for (Planina planina : listaPlanina) {
            if (planina.getVisina() > maxVisina) {
                crnePlanine.add(planina);
            }
        }
        return crnePlanine;
    }

    public int ukupnoMetara() {
        int ukupnaVisina = 0;
        for (Planina planina : listaPlanina) {
            ukupnaVisina += planina.getVisina();
        }
        return ukupnaVisina;
    }

    @Override
    public String toString() {
        return "Planinar " +
                imePlaninara +
                " ima listu planina na koje se popeo " +
                listaPlanina +
                " i maksimalna visina na koju se popeo je "
                + maxVisina;
    }

}
