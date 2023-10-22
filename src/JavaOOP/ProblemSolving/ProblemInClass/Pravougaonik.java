package javaoop.petak;

public class Pravougaonik {

    /*
     * Napraviti klasu Pravougaonik za rad sa pravougaonicima.
     * Pravougaonik ima:
     * - stranicu a
     * - stranicu b
     *
     * - Napraviti konstruktore za ovu klasu
     * - Napisati metode obim i povrsina
     * - Napisati metodu koja serilizuje ovu klasu (pretvaranje klase u String)
     *  "Pravougaonika stranica <a> i <b> ima:"
     *  "Obim: <obim>"
     *   "Povrsinu: <povrsina>"


     * -Serilizovati klasu
     * */

    private double a;
    private double b;

    public Pravougaonik(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double obim() {
        return 2*(a+b);
    }

    public double povrsina() {
        return a*b;
    }

    public String serijalizacija() {
        return "Pravougaonika stranica" + a + " i " + b + "ima:\n" +
                "Obim:" + obim() + "\n" +
                "Povrsinu:" + povrsina();
    }

    public static void main(String[] args) {

        Pravougaonik pravougaonik = new Pravougaonik(23, 45);
        System.out.println(pravougaonik.serijalizacija());
    }

}
