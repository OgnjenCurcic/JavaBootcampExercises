package JavaProgramming.JavaProblemsForTest.Nizovi;

import java.util.Scanner;

public class PasteBinZadatak1 {

    /*Omoguciti da korisnik unese n brojeva preko skenera i smestiti ih u niz. Ispisati taj niz u obrtnutom redosledu
    Primer: [4, 2, 3, 5] -> 5 3 2 4*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj n: ");
        int n = sc.nextInt();

        double[] niz =  new double[n];
        for (int i = 0; i < n; i++) {
            niz[i] = sc.nextDouble();
        }

        System.out.print("Unesite obrnut niz: ");

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(niz[i] + "");
        }

    }

}
