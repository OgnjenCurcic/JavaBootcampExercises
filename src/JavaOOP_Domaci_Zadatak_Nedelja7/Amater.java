package domaciNedelja7;

public class Amater extends Planinar {

    public Amater(String imePlaninara) {
        super(imePlaninara, 1000);
    }

    @Override
    public void popniSe(Planina p) {
        if (p.getVisina() <= getMaxVisina() && !getListaPlanina().contains(p)) {
            getListaPlanina().add(p);
        }
    }

}
