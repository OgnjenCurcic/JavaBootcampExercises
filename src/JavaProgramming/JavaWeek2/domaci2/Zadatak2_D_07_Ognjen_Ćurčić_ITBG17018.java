package JavaProgramming.JavaWeek2.domaci2;

public class Zadatak2_D_07_Ognjen_Ćurčić_ITBG17018 {

    /*Zadatak 2:
    Napraviti niz brojeva i kao rezultat vratiti sumu svih parnih brojeva iz tog niza.*/

    public static void main(String[] args) {

        int[] brojevi = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int sumaParnihBrojeva = 0;
        for (int i = 0; i < brojevi.length; i++) {
            if (brojevi[i] % 2 == 0) {
                sumaParnihBrojeva = sumaParnihBrojeva + brojevi[i];
            }
        }
        System.out.println("Suma parnih brojeva je: " + sumaParnihBrojeva);
    }
}
