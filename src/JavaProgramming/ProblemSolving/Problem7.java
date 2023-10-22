package JavaProgramming.ProblemSolving;

import java.util.Scanner;

public class Problem7 {

    /*
     * Korisnik unosi koliko ima zlatnih novcica (1, 2 ili 3)
     * Treba ispisati sta sve moze da kupi od stvari:
     * - Mac kosta 1 zlatnik
     * - Stit kosta 2 zlatnika
     * - Konj kosta 3 zlatnika
     *
     * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite broj zlatnih novcica (1, 2 ili 3): ");
        int brojNovcica = sc.nextInt();

        switch (brojNovcica) {
            case 1:
                System.out.println("Mozete kupiti mac");
                break;
            case 2:
                System.out.println("Mozete kupiti stit ili mac");
                break;
            case 3:
                System.out.println("Mozete kupiti samo konja ili samo stit ili stit i mac");
        }

    }

}
