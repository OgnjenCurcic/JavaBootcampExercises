package ProblemSolving;

import java.util.Map;
import java.util.Scanner;

public class Problem5 {

    /*
    Korisnik unosi ceo broj x.
    Ispisati apsolutnu vrednost broja x
    Ispisati poruku "x-u je promenjen znak" ukoliko je uneta negativna vrednost
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ceo broj x: ");
        int x = sc.nextInt();
        System.out.println("Apsolutna vrednosta unetog broja x je: ");
        int absoluteX = Math.abs(x);
        System.out.println(absoluteX);

        if (x < 0)
            System.out.println("x-u je promenjen znak");
        else
            System.out.println("x je bio pozitivan broj");
    }

}
