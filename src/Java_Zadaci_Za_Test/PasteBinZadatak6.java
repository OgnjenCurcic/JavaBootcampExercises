package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak6 {

/*
    6. Za unet pozitivan ceo broj n, ispisati sve brojeve od i zakljucno sa 0 do i zakljucno sa n.
*/

    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Unesite pozitivan ceo broj n: ");
            int n = scanner.nextInt();

            if (n < 0) {
                System.out.println("Molimo unesite pozitivan ceo broj.");
            } else {
                for (int i = n; i >= 0; i--) {
                    System.out.println(i);
                }
            }

    }
}
