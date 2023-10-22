package javaoop.petak;

/*
 * Hocemo da kreiramo klasu koja opisuje automobile.
 * Svaki automobil ima:
 * -String marku
 * -String tip
 * -char boja {'g' = green, 'b' = blue ...}
 * -int brojSedista
 * -int brojSasije.
 * -double kubikaza
 *
 * -Kreirati 2 konstruktora
 * Jedan potpun koji prima sve argumente za atribute
 * Jedan prazan koji postavlja sve atribute na podrazumevane vrednosti
 *
 * -Enkapsulirati svaki atribut i za svaki atribut kreirati (obicne) gettere i setter
 *
 * -Napisati metode:
 * 1. public String informacija() - vraca informacije o automobilu
 * 2. public boolean daLiSuIsti(Automobil b) - vraca informaciju da li je prosledjen
 * automobil isti kao i objekat automobila koji poziva ovu metodu.
 * Dva automobila su ista akko imaju sve atribute.
 *
 *
 *
 * */

public class Automobil {
    private String marka;
    private String tip;
    private char boja;
    private int brojSedista;
    private int brojSasije;
    private double kubikaza;


    public Automobil(String marka, String tip, char boja, int brojSedista, int brojSasije, double kubikaza) {
        this.marka = marka;
        this.tip = tip;
        this.boja = boja;
        this.brojSedista = brojSedista;
        this.brojSasije = brojSasije;
        this.kubikaza = kubikaza;
    }


    public Automobil() {
        this.marka = "";
        this.tip = "";
        this.boja = ' ';
        this.brojSedista = 0;
        this.brojSasije = 0;
        this.kubikaza = 0.0;
    }


    //Getteri i setteri
    public String getMarka(String marka) {
        return marka;
    }
    public String setMarka(String marka) {
        return this.marka;
    }
    public String tipAutomobila(String tip) {
        return this.tip;
    }
    public char bojaAutomobila(char boja) {
        return this.boja;
    }




}

