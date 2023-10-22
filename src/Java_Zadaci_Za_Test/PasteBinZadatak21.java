package Java_Zadaci_Za_Test;

import java.util.Scanner;

public class PasteBinZadatak21 {

    /*21. Korisnik unosi imena cveca sve dok ne unese nisku "stop".
    - Izracunati koliko ukupno korisnik treba da plati cvece koje je izabrao.
    - Cvece koje se mogu kupiti i njihova cena je:
    - "Ruza" - 100 din
    - "Zumbul" - 200 din
    - "Lala" - 300 din*/

    public static void main(String[] args) {

        String stop = "stop";

        Scanner sc = new Scanner(System.in);

        String imeCveca = sc.toString();
        String ruza = "Ruza";
        int cenaRuze = 100;
        String zumbul = "Zumbul";
        int cenaZumbula = 200;
        String lala = "Lala";
        int cenaLale = 300;

        while (imeCveca != stop)
            if (imeCveca == ruza)
                System.out.println("Kupili ste ruzu za " + cenaRuze + " dinara");



    }

}
