package NedeljaVI;

/*Autor
 * - prosiruje Osobu
 * - ArrayList<Knjige> knjigeKojeJeNapisao; */

import java.util.ArrayList;

public class Autor extends Osoba {

    private ArrayList<Knjiga> knjigeKojeJeNapisao;

    public Autor(String ime, String prezime, int brojGodina) {
        super(ime, prezime, brojGodina);
        this.knjigeKojeJeNapisao = new ArrayList<>();
    }

    public ArrayList<Knjiga> getKnjigeKojeJeNapisao () {
        return knjigeKojeJeNapisao;
    }

    public int brojKnjigaKojeJeIspisao() {
        return knjigeKojeJeNapisao.size();
    }

    private String ispisKnjiga() {
        StringBuilder sb = new StringBuilder();

        for (Knjiga knjiga : knjigeKojeJeNapisao) {
            sb.append("\"").append(knjiga.getNaziv()).append("\"").append(" ");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return super.toString() + "\n Knjige: " + ispisKnjiga();
    }


}
