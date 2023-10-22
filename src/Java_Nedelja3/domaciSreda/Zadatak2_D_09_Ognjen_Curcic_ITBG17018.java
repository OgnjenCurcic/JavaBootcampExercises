package nedeljaIII.domaciSreda;

public class Zadatak2_D_09_Ognjen_Curcic_ITBG17018  {

    /* 2. Napraviti funkciju koja prima dva niza celih brojeva jednake duzine i kao rezultat vraca zbir
    svih elemenata na istoj poziciji*/

    static int[] saberiNizove(int[] niz1, int[] niz2) {

        int[] veci;
        int[] manji;
        if (niz1.length > niz2.length) {
            veci = niz1;
            manji = niz2;
        } else {
            veci = niz2;
            manji = niz1;
        }

        int[] rez = new int[veci.length];

        for (int i = 0; i < veci.length; i++) {
            if(i < manji.length){
                rez[i] = veci[i] + manji[i];
            } else {
                rez[i] = veci[i];
            }
        }
        return rez;
    }

    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 4, 10};
        int[] niz2 = {3, 5, 7, 9, 30, 12, 99};
        int[] niz3 = saberiNizove(niz1, niz2);

        for (int i = 0; i < niz3.length; i++) {
            System.out.println("Element prvog niza: " + niz1[i] + " Element drugog : " + niz2[i]);
        }

        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }

    }

}
