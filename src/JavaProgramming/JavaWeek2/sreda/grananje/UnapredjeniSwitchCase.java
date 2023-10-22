package JavaProgramming.JavaWeek2.sreda.grananje;

public class UnapredjeniSwitchCase {

    public static void main(String[] args) {
        /*
         * Korisnik unosi neki od brojeva -1, 0, 1
         * ispisati odgovarajucu poruku:
         * "negativan"
         * "pozitivan"
         * "neutralan"
         * */
        int x = 0;

        switch (x) {
            case -1 -> {
                System.out.println("Negativan");
                double prosek = 5.5;
                prosek += 1;
                //break; //U enhanced switch ne treba break
            }
            case 0 -> {
                System.out.println("Neutralan");
                double prosek = 2.3;
                //break;
            }
            case 1 -> {
                System.out.println("Pozitivan");
                //break;
            }
        }
    }
}