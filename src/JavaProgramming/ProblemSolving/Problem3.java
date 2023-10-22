package JavaProgramming.ProblemSolving;

import java.util.Scanner;

public class Problem3 {

    /*
    *
    Korisnik unosi cenu artikla (double) i raspolozivo stanje svog racuna.(double)
    Ispisati poruku:
    - "Ne mozete kupiti artikal"; ukoliko korisnik nema dovoljno novca na racunu
    - "Kupili ste artikal"; ukoliko korisnik ima dovoljno novca na racunu
    Ispisati poruku "Preostalo stanje na racunu: <stanje_na_racunu>"
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite cenu artikla: ");
        double cenaArtikla = sc.nextDouble();
        System.out.println("Unesite raspolozivo stanje racuna: ");
        double stanjeRacuna = sc.nextDouble();

        if (stanjeRacuna >= cenaArtikla) {
            System.out.println("Kupili ste artikal");
            stanjeRacuna -= cenaArtikla;
            System.out.println("Preostalo stanje na racunu: " + stanjeRacuna);
        }
        else {
            System.out.println("Ne mozete kupiti artikal");
        }

    }

}
