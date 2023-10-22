package JavaProgramming.Branching.zadaci;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) {

        /*
        * 2.
        Korisnik unosi cenu artikla (double) i raspolozivo stanje svog racuna.(double)
        Ispisati poruku:
        - "Ne mozete kupiti artikal"; ukoliko korisnik nema dovoljno novca na racunu
        - "Kupili ste artikal"; ukoliko korisnik ima dovoljno novca na racunu

        * Ispisati poruku "Preostalo stanje na racunu: <stanje_na_racunu>"
        * */
        Scanner sc = new Scanner(System.in);
        double cenaArtikla = sc.nextDouble();
        double stanjeRacuna = sc.nextDouble();

        if (cenaArtikla <= stanjeRacuna) {
            System.out.println("Kupili ste artikal");
            stanjeRacuna = stanjeRacuna - cenaArtikla;
        } else {
            System.out.println("Ne mozete kupiti artikal");
        }

        System.out.println("Preostalo stanje na racunu je: " + stanjeRacuna);

    }
}
