package ProblemSolving;

import java.util.Scanner;

public class Problem12 {

    /*Olimpijske medalje
    Korisnik unosi imena 3 drzava koje su se takmicile na olimpijskim igrama
    u Tokiju 2021. Nakon toga unosi redom po 3 cela broja za svaku (ukupno 9 brojeva)
    koje redom oznacavaju broj osvojenih zlatnih medalja,
    broj osvojenih srebrnih medalja, broj osvojenih bronzanih medalja.
    Na standardni izlaz ispisati ime pobednicke drzave. Pobednicka drzava je ona
    koja ima vise zlatnih medalja u odnosu na ostale dve. Ukoliko neke 2 drzave
    imaju isti broj osvojenih zlatnih medalja, onda je pobedila ona koja ima najvise
    srebrnih medalja. Ukoliko dve drzave takodje imaju isti broj osvojenih
    srebrnih medalja, onda se gledaju bronzane, a ukoliko imaju isti broj svih medalja
    ispisati poruku "Nereseno".*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ime prve drzave: ");
        String drzava1 = sc.next();
        System.out.println("Unesite ime druge drzave: ");
        String drzava2 = sc.next();
        System.out.println("Unesite ime trece drzave: ");
        String drzava3 = sc.next();

        System.out.println("Unesite broj zlatnih, srebrnih i bronzanih medalja prve drzave: ");
        int zlatne1 = sc.nextInt();
        int srebrne1 = sc.nextInt();
        int bronzane1 = sc.nextInt();
        System.out.println("Unesite broj zlatnih, srebrnih i bronzanih medalja druge drzave: ");
        int zlatne2 = sc.nextInt();
        int srebrne2 = sc.nextInt();
        int bronzane2 = sc.nextInt();
        System.out.println("Unesite broj zlatnih, srebrnih i bronzanih medalja trece drzave: ");
        int zlatne3 = sc.nextInt();
        int srebrne3 = sc.nextInt();
        int bronzane3 = sc.nextInt();

    }

}
