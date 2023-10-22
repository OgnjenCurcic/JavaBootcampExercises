package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak9 {

    //9. Ispisati proizvod prvih n celih brojeva [1, n].

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Molimo unesite pozitivan ceo broj!");
        } else {
            int proizvod = 1;
            for (int i = 1; i <= n; i++) {
                proizvod = proizvod * i;
                System.out.println(i);
            }
            System.out.println("Proizvod prvih " + n + " celih brojeva je: " + proizvod);
        }


    }

}
