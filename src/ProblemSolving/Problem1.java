package ProblemSolving;

import java.util.Scanner;

public class Problem1 {

    /*  Korisnik unosi dva realna broja x i y sa tastature (standardni ulaz).
        Prikazati rezulate:
        x + y
        X - y
        x * y
        x / y*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi realan broj: ");
        double x = sc.nextDouble();
        System.out.println("Unesite drugi realan broj: ");
        double y = sc.nextDouble();

        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));

    }

}
