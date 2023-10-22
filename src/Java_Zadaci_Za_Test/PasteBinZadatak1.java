package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak1 {

    /*1. Za unet broj n, ispisati "Paran" ako je paran, a "Neparan" ako je neparan.*/

    static boolean paran(int broj) {
        return broj % 2 ==0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (paran(n)) {
            System.out.println("Broj je paran");
        } else {
            System.out.println("Broj je neparan");
        }

    }
}
