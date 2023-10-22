package JavaProgramming.JavaProblemsForTest;

import java.util.Scanner;

public class PasteBinZadatak17 {

    /*
    17. Napraviti digitron koji prima double, char, double, gde je char neki od simbola: {+, -, *, /, %, ^}
     i ispisuje resenje odgovarajuce operacije.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double x = sc.nextDouble();

        System.out.println("Unesite operaciju: ");
        char operacija = sc.next().charAt(0);

        System.out.println("Unesite drugi broj: ");
        double y = sc.nextDouble();

        switch (operacija) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                if (y == 0) {
                    System.out.println("Nije moguce deliti sa 0");
                } else {
                    System.out.println(x / y);
                }
                break;
            case '%':
                if (y == 0) {
                    System.out.println("Nije moguce mod sa 0");
                } else {
                    System.out.println(x % y);
                }
                break;
            case '^':
                System.out.println(Math.pow(x, y));
                break;


        }

    }

}
