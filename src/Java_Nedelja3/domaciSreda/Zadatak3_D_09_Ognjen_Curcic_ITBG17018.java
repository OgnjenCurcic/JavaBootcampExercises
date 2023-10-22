package nedeljaIII.domaciSreda;

public class Zadatak3_D_09_Ognjen_Curcic_ITBG17018 {

    /* 3. Napraviti funkciju koja prima niz Stringova nekih imena i kao rezultat vraca broj duplikata
    imena(Ukoliko ih ima).*/

    public static int racunanjeDuplikata(String[] imena) {
        int brojDuplikata = 0;

        for (int i = 0; i < imena.length; i++) {
            for (int j = i + 1; j < imena.length; j++) {
                if (imena[i].equals(imena[j])) {
                    brojDuplikata++;
                }
            }
        }
        return brojDuplikata;
    }

    public static void main(String[] args) {
        String[] imena = {"Jelena", "Stefan", "Djordje", "Jelena", "Jelena", "Stefan"};
        int brojDuplikata = racunanjeDuplikata(imena);

        System.out.println("Broj duplikata imena je : " + brojDuplikata);
    }
}




