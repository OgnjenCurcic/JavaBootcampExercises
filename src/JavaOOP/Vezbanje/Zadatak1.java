package vezvanjeNaCasu;

import java.util.Scanner;

public class Zadatak1 {

    /*
    1. Napisati funkciju koja od korisnika prima dva double broja i vraca povrsinu pravougaonika cije
     su duzine stranica jednake tim unetim brojevima (stranica a = prvi broj; stranica b = drugi broj)
    */

    static double povrsinaPravougaonika(double x, double y){
        return x * y;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Unesite duzinu prve stranice: ");
        double stranicaA = sc.nextDouble();
        System.out.println("Unesite duzinu druge stranice: ");
        double stranicaB = sc.nextDouble();

        double povrsina = povrsinaPravougaonika(stranicaA, stranicaB);

        System.out.println("Povrsina pravougaonika je: " + povrsina);

    }

}
