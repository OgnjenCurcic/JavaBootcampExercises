package JavaProgramming.JavaProblemsForTest;

import java.util.Scanner;

public class PasteBinZadatak19 {

    //19. Uneti pozitivan ceo broj n. Zatim izracunati proizvod unetih narednih n brojeva (double).

    static double racunanjeProizvoda(int n){
        Scanner sc = new Scanner(System.in);
        double proizvod = 1;
        for (int i = 0; i < n; i++) {
            System.out.println("Unesite " + (i+1) + ". broj: ");
            double broj = sc.nextDouble();
            proizvod = proizvod * broj;
        }
        return proizvod;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double proizvod = racunanjeProizvoda(n);
        System.out.println("Proizvod svih n brojeva je: " + proizvod);

    }
}
