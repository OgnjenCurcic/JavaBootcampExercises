package domaciNedelja7;

public class Test {
    public static void main(String[] args) {


        Planina jastrebac = new Planina("Jastrebac", 800);
        Planina kopaonik = new Planina("Kopaonik", 2000);

        Amater amater = new Amater("Misa");
        amater.popniSe(jastrebac);
        amater.popniSe(kopaonik);

        System.out.println("Planinareva lista planina: " + "\n" + amater.getListaPlanina());
        System.out.println("Planinareva crna lista planina: " + "\n" + amater.crnaLista());
        System.out.println("Ukupna visina koju je planinar prešao: " + "\n" + amater.ukupnoMetara());

    }
}