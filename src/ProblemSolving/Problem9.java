package ProblemSolving;

import java.util.Scanner;

public class Problem9 {

    /*Napisati program gde korisnik unosi ceo broj, ukoliko je broj paran, promeniti ga u neparan i
    istampati, ukoliko je neparan, samo ispisati poruku da je u pitanju neparan broj*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite ceo broj: ");
        int x = sc.nextInt();

        if (x % 2 == 0) {
            x++;
            System.out.println("Promenjen broj je: " + x);
        }
        else {
            System.out.println("Broj je neparan");
        }

    }
}
