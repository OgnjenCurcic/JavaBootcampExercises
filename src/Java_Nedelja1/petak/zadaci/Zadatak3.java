package nedeljaI.petak.zadaci;

import javax.management.openmbean.SimpleType;
import java.util.Scanner;

public class Zadatak3 {

    public static void main(String[] args) {
        /*
        * 3.
    Korisnik unosi broj svojih godina (int), svoju visinu u metrima (double) i
    * minimalnu potrebnu visinu za ulazak u luna park(double).
    Ispisati poruku:
    - "Dobro dosli" - ukoliko je korisnik strogo stariji od 16 godina
                  ili visi od minimalne visine.
    - "Ne mozete prisustvovati luna parku" - inace
    * */

        Scanner sc = new Scanner(System.in);
        int brojGodina = sc.nextInt();
        double visina = sc.nextDouble();
        double minVisina = sc.nextDouble();

        if (brojGodina > 16 || visina >= minVisina) {
            System.out.println("Dobro dosli!");
        } else {
            System.out.println("Ne mozete prisustvovati parku");
        }

    }
}
