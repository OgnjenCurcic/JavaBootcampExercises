package nedeljaIII.domaciSreda;

public class Zadatak1_D_09_Ognjen_Curcic_ITBG17018  {

    // 1. Napraviti funkciju koja prima dva niza celih brojeva i proverava da li su jednaki.

    public static void main(String[] args) {
        int[] niz1 = {11, 21, 31, 41, 51};
        int[] niz2 = {11, 12, 13, 14, 15};

        boolean rez = jednakostNizova(niz1, niz2);

        for (int i = 0; i < niz1.length; i++) {
            System.out.println("Element prvog niza: " + niz1[i] + " Element drugog : " + niz2[i]);
        }

        if (rez) {
            System.out.println("Nizovi su jednaki.");
        } else {
            System.out.println("Nizovi nisu jednaki.");
        }
    }
    public static boolean jednakostNizova(int[] niz1, int[] niz2) {

        if (niz1.length != niz2.length) {
            return false;
        }

        for (int i = 0; i < niz1.length; i++) {
            if (niz1[i] != niz2[i]) {
                return false;
            }
        }
        return true;
    }
}






