package ProblemSolving;

import java.util.Scanner;

public class Problem4 {

    /*
    *
    * Korisnik unosi broj svojih godina (int), svoju visinu u metrima (double) i
    * minimalnu potrebnu visinu za ulazak u luna park(double).
    * Ispisati poruku:
    * -"Dobro dosli" - ukoliko je korisnik strogo stariji od 16 godina
    * ili visi od minimalne visine.
    * - "Ne mozete prisustvovati luna parku" - inace
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite Vas broj godina: ");
        int brojGodina = sc.nextInt();
        System.out.println("Unesite Vasu visinu u metrima: ");
        double visina = sc.nextDouble();
        System.out.println("Unesite minimalnu potrebnu visinu za ulazak u luna park: ");
        double minVisina = sc.nextDouble();

        if (brojGodina > 16 || visina >= minVisina)
            System.out.println("Dobro dosli!");
        else
            System.out.println("Ne mozete prisustvovati luna parku");
    }

}
