package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak15 {

    //15. Za unete brojeve a, b i c ispisati najmanji od njih

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite broj a: ");
        int a = sc.nextInt();

        System.out.print("Unesite broj b: ");
        int b = sc.nextInt();
        System.out.print("Unesite broj c: ");
        int c = sc.nextInt();

        int najmanji = a;

        if (b < najmanji) {
            najmanji = b;
        }

        if (c < najmanji) {
            najmanji = c;
        }

        System.out.println("Najmanji broj je: " + najmanji);

    }

}


