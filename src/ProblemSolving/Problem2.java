package ProblemSolving;

import java.util.Scanner;

public class Problem2 {

    /*
    Korisnik unosi dva cela broja a i b; Ispisati odgovarajucu poruku:
    - "Oba su pozitivna"; ako su oba broja pozitivna
    - "Oba su negativna"; ako su oba broja negativna
    - "Jedan je pozitivan a drugi negativan"; ako je jedan pozitivan, a drugi negativan */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite prvi ceo broj: ");
        int a = sc.nextInt();
        System.out.println("Unesite drugi ceo broj: ");
        int b = sc.nextInt();

        if (a >= 0 && b >= 0)
            System.out.println("Oba su pozitivna");
        else if (a < 0 && b < 0)
            System.out.println("Oba su negativna");
        else
            System.out.println("Jedan je pozitivan, a drugi je negativan");

    }

}
