package zadaciZaTest;

public class Zadatak4 {

    //28.Napisati fuknciju koja vraca double duzinu stranice kvadrata za prosledjenu double povrsinu kvadrata.

    static double duzinaStraniceKvadarata(double povrsina){
        return Math.sqrt(povrsina);
    }


    public static void main(String[] args) {

        double povrsina = 144;
        double duzinaStranice = duzinaStraniceKvadarata(povrsina);
        System.out.println("Duzina stranice je: " + duzinaStranice);

    }

}
