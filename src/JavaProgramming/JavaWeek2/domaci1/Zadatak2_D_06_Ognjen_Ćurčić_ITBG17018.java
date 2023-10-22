package JavaProgramming.JavaWeek2.domaci1;

import java.util.Scanner;

public class Zadatak2_D_06_Ognjen_Ćurčić_ITBG17018 {

    /*Zadatak 2:
    Napraviti program koji ce za uneti ceo broj vratiti njegov faktorijel (3! = 3*2*1)*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Uneti neki nenegativan ceo broj: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("Faktorijal nije definisan za negativne brojeve");
        } else {
            int faktorijal = 1;
            int i = 1;
            while (i <= x) {
                faktorijal = faktorijal * i;
                i++;
            }
            System.out.println("Faktorijal broja " + x + " je " + faktorijal);
        }



    }
}
