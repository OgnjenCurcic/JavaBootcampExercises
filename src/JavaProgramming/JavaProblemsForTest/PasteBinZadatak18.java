package JavaProgramming.JavaProblemsForTest;

import java.util.Scanner;

public class PasteBinZadatak18 {

    //18. Uneti pozitivan ceo broj n. Zatim izracunati sumu unetih narednih n brojeva (double).

    static double racunanjeSume(int n){
        Scanner sc = new Scanner(System.in);
        double suma = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(i+1);
            double broj = sc.nextDouble();
            suma = suma + broj;
        }
        return suma;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite pozitivan ceo broj n: ");
        int n = sc.nextInt();

        double suma = racunanjeSume(n);
        System.out.println("Suma unetih brojeva je: " + suma);

    }

}
