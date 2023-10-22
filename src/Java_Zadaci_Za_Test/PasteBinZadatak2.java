package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak2 {

    /*
    * 2. Za unet broj n, ispisati "Pozitivan" ako je strogo veci od 0, "Negativan" ako je
    * strogo manji od 0 ili "Neutralan" ako je tacno 0.
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite neki broj n: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Pozitivan");
        } else if (n == 0) {
            System.out.println("Neutralan");
        } else {
            System.out.println("Negativan");
        }
    }
}
