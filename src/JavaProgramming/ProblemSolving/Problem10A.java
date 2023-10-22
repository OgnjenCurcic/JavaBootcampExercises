package JavaProgramming.ProblemSolving;

import java.util.Scanner;

public class Problem10A {

    /*Napisati program gde korisnik unosi dva realna broja, zatim unosi naziv operacije koju zeli
    da izvrsi nad tim brojevima(sabiranje, oduzimanje, mnozenje, deljenje), zatim istampati
    rezultat date operacije*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi realan broj: ");
        double x = sc.nextDouble();
        System.out.println("Unesite drugi realan broj: ");
        double y = sc.nextDouble();

        System.out.println("Unesite naziv operacije (sabiranje, oduzimanje, mnozenje, deljenje): " );
        String operacija = sc.next();

        if (operacija.equals("sabiranje")) {
            System.out.println(x + y);
        } else if (operacija.equals("oduzimanje")) {
            System.out.println(x - y);
        } else if (operacija.equals("mnozenje")) {
            System.out.println(x * y);
        } else if (operacija.equals("deljenje")) {
            System.out.println(x / y);
        }

    }

}
