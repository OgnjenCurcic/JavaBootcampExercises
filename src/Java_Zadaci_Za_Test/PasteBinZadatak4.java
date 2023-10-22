package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak4 {

    /*
    * 4. Za uneta dva broja ispisati poruku "Istog znaka" ako su oba broja istog znaka,
    * a poruku "Suprotnog znaka", ako nisu istog znaka.
    */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti dva broja: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        if ((x >= 0 && y >= 0) || (x < 0 && y < 0)) {
            System.out.println("Istog znaka");
        } else {
            System.out.println("Suprotnog znaka");
        }


    }
}
