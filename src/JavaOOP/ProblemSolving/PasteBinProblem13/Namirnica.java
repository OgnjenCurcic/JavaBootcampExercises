package JavaOOP.ProblemSolving.PasteBinProblem13;

public class Namirnica {

    /*Napisati klasu Namirnica koja ima atribute
    - String ime
    - double cena

    Napisati 2 konstruktora:
    - Jedan koji prima sve argumente. Ukoliko primi null za ime, postaviti ga na prazan string.
    Ukoliko primi negativnu vrednost za cenu postaviti je na 0.- Podrazumevani konstruktor
    koji ne prima ni jedan argument i postavlja atribute na "" i 0

    Napisati sve gettere i settere

    Omoguciti poredjenje objekata ove klase preko equals() i hashCode() metoda
    Dve namirnice su iste ako imaju isto ime i istu cenu.

    Overridovati toString() metod na sledeci nacin:
    "<ime> | <cena>"*/

    private String ime;
    private double cena;

    public Namirnica(String ime, double cena) {
        if (ime == null) {
            this.ime = " ";
        } else {
            this.ime = ime;
        }
        if (cena < 0) {
            this.cena = 0;
        } else {
            this.cena = cena;
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Namirnica () {
        this("", 0);
    }

    @Override
    public String toString () {
        return ime + " | " + cena;
    }

}

