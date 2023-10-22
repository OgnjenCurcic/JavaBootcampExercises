package NedeljaVI;

public class Knjiga {

    /*String naziv;
    * - int brojStranica;
    * - double cena;
    * - Autor autor;
    * (opciono - jedinstven ISBN)*/

    private String naziv;
    private int brojStranica;
    private double cena;
    private Autor autor;
    private String isbn;
    private int ISBN = 0;

    public Knjiga (String naziv, int brojStranica, double cena, Autor autor) {

        ISBN++;

        this.naziv = naziv;
        this.brojStranica = brojStranica;
        this.cena = cena;
        this.autor = autor;
        this.isbn = "SRB" + ISBN + "K1389";    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getBrojStranica() {
        return brojStranica;
    }

    public void setBrojStranica(int brojStranica) {
        if (brojStranica >= 0)
            this.brojStranica = brojStranica;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        if(cena >= 0)
            this.cena = cena;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString () {
        StringBuilder sb = new StringBuilder();
        sb.append("Knjiga: ").append(naziv).append("\n");
        sb.append("Broj stranica: ").append(brojStranica).append("\n");
        sb.append("Cena: ").append(cena).append("\n");
        sb.append("Autor: ").append(autor.getIme()).append(" ").append(autor.getPrezime()).append("\n");
        sb.append("ISBN: ").append(isbn);

        return sb.toString();
    }

}
