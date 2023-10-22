package vezbanje;

import java.util.Scanner;

public class PasteBInZadatak12 {

    /*12. Za unet ceo broj n, ispisati za svaki od brojeva [1, n] "Fizz" ako je deljiv sa 3,
         "Buzz" ako je deljiv sa 5, "Zazz" ako je deljiv sa 7 i sve ostale varijacije
         ("BuzzZazz" ako je deljiv i sa 5 i sa 7, ...)*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Uneti ceo broj n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {
                System.out.println("FizzBuzzZazz");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("FizzZazz");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.println("BuzzZazz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else if (i % 7 == 0) {
                System.out.println("Zazz");
            } else {
                System.out.println(i);
            }
        }



    }

}
