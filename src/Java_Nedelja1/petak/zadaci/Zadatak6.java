package nedeljaI.petak.zadaci;

import java.util.Scanner;

public class Zadatak6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*6.
         * Korisnik unosi koliko ima zlatnih novcica (1, 2 ili 3)
         * Treba ispisati sta sve moze da se kupi od stvari:
         * - Mac kosta 1 zlatnik
         * - Stit kosta 2 zlatnika
         * - Konj kosta 3 zlatnika
         *
         * */

        System.out.println("Unesite broj zlatnih novcica (1, 2 ili 3): ");
        int brojZlatnihNovcica = sc.nextInt();

        switch (brojZlatnihNovcica) {
            case 1 :
                System.out.println("Mozete kupiti mac");
                break;
            case 2 :
                System.out.println("Mozete kupiti mac ili stit");
                break;
            case 3 :
                System.out.println("Mozete kupiti mac, stit, konja ili mac i stit");
                break;
            default:
                System.out.println("Ne mozete kupiti nista");
        }


    }
}
