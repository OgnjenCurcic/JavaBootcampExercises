package JavaProgramming.JavaProblemsForTest;

import java.util.Scanner;

public class PasteBinZadatak14 {

    //14. Za unete brojeve a i b ispisati veci od njih.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            System.out.println("Veci broj je: " + a);
        } else if (a == b) {
            System.out.println("Jednaki su");
        } else {
            System.out.println("Veci broj je: " + b);
        }

    }

}
