package JavaProgramming.Branching.zadaci;

import java.util.Scanner;

public class Zadatak4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*4.
        Korisnik unosi ceo broj x.
        Ispisati apsolutnu vrednost broja x
        Ispisati poruku "x-u je promenjen znak" ukoliko je uneta negativna vrednost
        */

        System.out.print("Unesite ceo broj x: ");
        int x = sc.nextInt();

        int absValue = Math.abs(x);
        System.out.println("Apsolutna vrednost broja x: " + absValue);

        if (x < 0) {
            System.out.println("x-u je promenjen znak");
        }

    }
}
