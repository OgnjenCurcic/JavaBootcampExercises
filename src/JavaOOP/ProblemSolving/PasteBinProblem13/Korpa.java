package JavaOOP.ProblemSolving.PasteBinProblem13;

import java.util.ArrayList;

public class Korpa {

    /*Napisati klasu Korpa koja ima atribute:
    - ArrayList<Namirnice>
    - double cenaKorpe

    Napisati podrazumevani konstruktor koji postavlja ArrayListu na novu ArrayListu i cenaKorpe na 0.

    Napisati sve gettere i settere

    Napisati metode:
    1. dodajUkorpu(Namirnica n) - koja dodaje u korpu neku namirnicu n i dodaje na cenuKorpe
    odgovarajucu cenu namirnice
    2. dodajUkorpu(Namirnica n, int k) - koja dodaje u korpu neku namirnicu n k puta i dodaje na
    cenuKorpe odgovarajucu cenu svih tih namirnica.
    3. ukloniIzKorpe(Namirnica n) - koja prima referencu na neku Namirnicu uklanja iz korpe jednu
    kopiju takve namirnice. Oduzeti od ceneKorpe cenu tog artikla. Ukoliko nema tog
    artikla u korpi, uraditi nista.
    4. ukloniIzKorpe(Namirnica n, int k) - koja radi kao metoda 3, s time sto brise k kopija
    takve namirnice. Ukoliko u korpi ima manje od k broja
    takve namirnice, obrisati sve takve namirnice.
    5. ukloniIzKorpeSveNamirniceN(Namirnica n) - radi kao 3. metoda, s time sto uklanja sve kopije takve namirnice.
    6. isprazniKorpu - koja prazni korpu i postavlja cenuKorpe na odgovarajucu vrednos.
    7. cenaKrope - koja vraca ukupnu cenu korpe

    Overridovati toString() metod kao:
    "<imeNamirnice1> | <brojKopijaNamirnice1> | <cenaSvihNamirnica1>
    ...
    <imeNamirniceN> | <brojKopijaNamirniceN> | <cenaSvihNamirnicaN>
    Cena korpe je: <cenaKopre>"*/

    private ArrayList <Namirnica> namirnice;
    private double cenaKorpe;

    public Korpa() {
        namirnice = new ArrayList<>();
        cenaKorpe = 0;
    }

    public ArrayList<Namirnica> getNamirnice() {
        return namirnice;
    }

    public void setNamirnice(ArrayList<Namirnica> namirnice) {
        this.namirnice = namirnice;
    }

    public double getCenaKorpe() {
        return cenaKorpe;
    }

    public void setCenaKorpe(double cenaKorpe) {
        this.cenaKorpe = cenaKorpe;
    }

    public void dodajUKorpu (Namirnica n) {
        namirnice.add(n);
        cenaKorpe += n.getCena();
    }

    public void dodajUKorpu (Namirnica n, int k) {
        for (int i = 0; i < k; i++) {
            dodajUKorpu(n);
        }
    }
    public void ukloniIzKorpe (Namirnica n) {
        if (namirnice.contains(n)) {
            namirnice.remove(n);
            cenaKorpe -= n.getCena();
        }
    }

    public void ukloniIzKorpe (Namirnica n, int k) {
        for (int i = 0; i < k; i++) {
            ukloniIzKorpe(n);
        }
    }

    public void ukloniIzKorpeSveNamirniceN(Namirnica n) {
       while (namirnice.contains(n)) {
           
       }
    }

}

