package domaciNedelja6;

import java.util.ArrayList;

import java.util.List;

public class Test {

    public static void main(String[] args) {

        Audi rsq8 = new Audi(2023, 180000);
        BMW e46 = new BMW(2003, 3700);
        Mercedes cls = new Mercedes(2011, 10000);

        Tocak t1 = new Tocak(75, 100);
        Tocak t2 = new Tocak(50, 120);
        Tocak t3 = new Tocak(60, 110);
        Tocak t4 = new Tocak(70, 120);

        List<Tocak> listaTockova = new ArrayList<>(List.of(t1,t2,t3,t4));
        List<Automobil> listaAutomobila = new ArrayList<>(List.of(rsq8, e46, cls));

        cls.setListaTockova(listaTockova);

        rsq8.setListaTockova(listaTockova);

        e46.setListaTockova(listaTockova);

        Salon porseCukarickaPadina = new Salon(listaAutomobila);
        System.out.println(porseCukarickaPadina);

    }

}
