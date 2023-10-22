package vezbanje;

import java.util.Scanner;

public class PasteBinZadatak5 {

    /*5.* Za unet cetvorocifren broj ispisati razliku proizvoda njegovih prvih dveju cifara
    od zbira njegovih drugih dveju cifara.*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Uneti cetvorocifren broj: ");
        int x = sc.nextInt();

        int prvaCifra = x / 1000;
        int drugaCifra = (x / 100) % 10;
        int trecaCifra = (x / 10) % 10;
        int cetvrtaCifra = x % 10;

        int proizvod = prvaCifra * drugaCifra;
        int zbir = trecaCifra + cetvrtaCifra;

        int rezultat = proizvod - zbir;

        System.out.println(rezultat);

    }

}


