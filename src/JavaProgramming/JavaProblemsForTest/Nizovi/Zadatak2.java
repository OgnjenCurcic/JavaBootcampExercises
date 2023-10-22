package JavaProgramming.JavaProblemsForTest.Nizovi;

import java.util.Scanner;

public class Zadatak2 {

    public static void main(String[] args) {

        int[] niz1 = {2, 11, 3, 50, 1};
        int[] niz2 = {1, 1, 13};

        int[] niz3 = saberiNizove(niz1, niz2);
        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }

    }

    public static int[] saberiNizove(int[] niz1, int[] niz2) {

        int[] veci;
        int[] manji;
        if (niz1.length > niz2.length) {
            veci = niz1;
            manji = niz2;
        } else {
            veci = niz2;
            manji = niz1;
        }
        int[] rezultat = new int[veci.length];
        for (int i = 0; i < veci.length; i++) {
            if (i < manji.length) {
                rezultat[i] = manji[i] + veci[i];
            } else {
                rezultat[i] = veci[i];
            }
        }
        return rezultat;
    }
}
