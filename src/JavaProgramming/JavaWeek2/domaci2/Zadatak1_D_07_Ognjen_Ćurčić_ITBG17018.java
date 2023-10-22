package JavaProgramming.JavaWeek2.domaci2;

public class Zadatak1_D_07_Ognjen_Ćurčić_ITBG17018 {

    /*Zadatak 1:
    Napraviti niz brojeva kroz koji cete proci i istampati samo neparne brojeve.*/

    public static void main(String[] args) {

        int[] brojevi = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        System.out.println("Neparni brojevi: ");
        for (int i = 0; i < brojevi.length; i++) {
            if (brojevi[i] % 2 != 0) {
                System.out.println(brojevi[i]);
            }
        }

    }
}
