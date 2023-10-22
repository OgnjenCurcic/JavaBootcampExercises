package domaciNedelja7;

public class Rekreativac extends Planinar {
    public Rekreativac(String imePlaninara) {
        super(imePlaninara, 2000);
    }

    @Override
    public void popniSe(Planina p) {
        if (p.getVisina() <= getMaxVisina() && !getListaPlanina().contains(p)) {
            getListaPlanina().add(p);
        }
    }
}