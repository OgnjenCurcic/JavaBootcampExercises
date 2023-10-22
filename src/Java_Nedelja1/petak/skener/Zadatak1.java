package nedeljaI.petak.skener;

import java.util.Scanner;

public class Zadatak1 {

    /*
    * Zadatak 1:
        Korisnik unosi dva realna broja x i y sa tastature (standardni ulaz).
        Prikazati rezulate:
            x + y
            x - y
            x * y
            x / y
    *
    * */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi realan broj: ");
        double x = sc.nextDouble();
        System.out.println("Unesite drugi realan broj: ");
        double y = sc.nextDouble();

        System.out.println("Zbir ova dva broja je: " + (x + y));
        System.out.println("Razlika ova dva broja je: " + (x - y));
        System.out.println("Proizvod ova dva broja je: " + (x * y));
        System.out.println("Kolicnik ova dva broja je: " + (x / y));

    }


}