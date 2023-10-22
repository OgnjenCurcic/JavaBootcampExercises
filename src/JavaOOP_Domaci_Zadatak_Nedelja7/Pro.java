package domaciNedelja7;

class Pro extends Planinar {
    public Pro(String imePlaninara) {
        super(imePlaninara, 3000);
    }

    @Override
    public void popniSe(Planina p) {
        if (p.getVisina() <= getMaxVisina() && !getListaPlanina().contains(p)) {
            getListaPlanina().add(p);
        }
    }
}