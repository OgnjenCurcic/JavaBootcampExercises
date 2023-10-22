package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak7 {

    /*7. Za unet negativan ceo broj n, ispisati sve brojeve od i zakljucno sa n do i zakljucno sa 0.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite negativan ceo broj n: ");
        int n = sc.nextInt();

        if (n > 0) {
            System.out.println("Molimo vas unesite negativan ceo broj!");
        } else {
            for (int i = n; i <= 0; i++) {
                System.out.println(i);
            }
        }

    }

}
