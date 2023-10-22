package JavaProgramming.ProblemSolving;

import java.util.Scanner;

public class Problem6 {

    /* Korisnik unosi jednocifren ceo broj
     * ispisati poruku "Paran" odnosno "Neparan" ako je unet
     * broj paran, odnosno neparan.
     * Uz zabranu koriscenja mod operatora (%)
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite jednocifren ceo broj: ");
        int x = sc.nextInt();

        switch (x) {
            case 2, 4, 6, 8:
                System.out.println("Paran");
                break;
            case 1, 3, 5, 7, 9:
                System.out.println("Neparan");
        }

    }

}
