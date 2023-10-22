package nedeljaII.domaci3;

import java.util.Scanner;

public class Zadatak1_D_08_Ognjen_Ćurčić_ITBG17018 {

    /*Zadatak 1:
    Napisati funkciju koja ce za prosledjeni String da vrati broj samoglasnika u tom Stringu
    (Koristiti .charAt(index) da pristupite svakom pojedinacnom karakteru iz Stringa).*/

    static int brojSamoglasnika (String text) {
        int broj = 0;
        String samoglasnici = "AEIOUaeiou";

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (samoglasnici.indexOf(c) != -1) {
                broj++;
            }
        }
        return broj;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String recenica = sc.nextLine();
        int brojSamoglasnika = brojSamoglasnika(recenica);

        System.out.println("Broj samoglasnika u recenici je: " + brojSamoglasnika);

    }
}
