package zadaciZaTest;

public class Zadatak3 {

    /*19.* Napisati funkciju koja sabira dva niza proizvoljne duzine.
    Npr: [1, 2, 3, 4, 5] + [1, 2, 3] -> [2, 4, 6, 4, 5]*/

    public static void main(String[] args) {

        int[] niz1 = {1, 2, 3, 4 ,5};
        int[] niz2 = {1, 2, 3};
        int[] niz3 = saberiNizove(niz1, niz2);

        for (int i = 0; i < niz3.length; i++) {
            System.out.println(niz3[i]);
        }
    }

    public static int[] saberiNizove(int[] niz1, int[] niz2){
        int[] veci;
        int[] manji;

        if(niz1.length > niz2.length) {
            veci = niz1;
            manji = niz2;
        } else {
            veci = niz2;
            manji = niz1;
        }

        int[] rez = new int[veci.length];

        for (int i = 0; i < veci.length; i++) {
            if(i < manji.length){
                rez[i] = manji[i] + veci[i];
            } else {
                rez[i] = veci[i];
            }
        }
        return rez;

    }

}
