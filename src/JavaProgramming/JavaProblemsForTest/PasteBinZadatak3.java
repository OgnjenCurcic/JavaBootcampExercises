package JavaProgramming.JavaProblemsForTest;

import java.util.Scanner;

public class PasteBinZadatak3 {

/*
    3. Za uneta dva broja a i b ispisati rezultat svih 5 osnovnih aritmetickih operacija: a+b, a-b, a*b, a/b, a%b.
*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti dva broja a i b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Izaberite jednu od operacija (+, -, *, /, %): ");
        char odabir = sc.next().charAt(0);

        switch (odabir) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                if (b != 0) {
                    System.out.println(a / b);
                } else {
                    System.out.println("Deljenje nulom nije definisano");
                }
                break;
            case '%':
                if (b != 0) {
                    System.out.println(a % b);
                } else {
                    System.out.println("Modul nije definisan");
                }
        }

    }

}
