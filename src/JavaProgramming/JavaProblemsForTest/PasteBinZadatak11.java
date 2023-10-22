package JavaProgramming.JavaProblemsForTest;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PasteBinZadatak11 {

    /*11. Korisnik unosi ime, prezime i godinu rodjena. Ispisati:
          "Dobrodosao u {x}. razred, {ime} {prezime}",
           pod pretpostavkom da je trenutna godina 2023. Pretpostavimo da ima 12 razreda.
           A ako korisnik nije djak ispisati jednu odgovarajucu poruku od:
           "{ime} {prezime} je zavrsio skolu" ili "{ime} {prezime} tek treba da zapocne obrazovanje"*/

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Unesite svoje ime: ");
        String ime = sc.nextLine();
        System.out.println("Unesite svoje prezime: ");
        String prezime = sc.nextLine();
        System.out.println("Unesite svoju godinu rodjenja: ");
        int godinaRodjenja = sc.nextInt();

        if (godinaRodjenja >= 2017) {
            System.out.println(ime + " " + prezime + " tek treba da zapocne obrazovanje");
        } else if (godinaRodjenja == 2016) {
            System.out.println("Dobrodosao u 1. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2015) {
            System.out.println("Dobrodosao u 2. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2014) {
            System.out.println("Dobrodosao u 3. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2013) {
            System.out.println("Dobrodosao u 4. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2012) {
            System.out.println("Dobrodosao u 5. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2011) {
            System.out.println("Dobrodosao u 6. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2010) {
            System.out.println("Dobrodosao u 7. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2009) {
            System.out.println("Dobrodosao u 8. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2008) {
            System.out.println("Dobrodosao u 9. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2007) {
            System.out.println("Dobrodosao u 10. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2006) {
            System.out.println("Dobrodosao u 11. razred " + ime + " " + prezime);
        } else if (godinaRodjenja == 2005) {
            System.out.println("Dobrodosao u 12. razred " + ime + " " + prezime);
        } else if (godinaRodjenja <= 2004) {
            System.out.println(ime + " " + prezime + " je zavrsio skolu.");

        }

    }
}