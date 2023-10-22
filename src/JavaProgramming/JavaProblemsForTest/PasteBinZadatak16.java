package JavaProgramming.JavaProblemsForTest;

public class PasteBinZadatak16 {

    /*16. Ispisati tablicu mnozenja jednocifrenih brojeva
          (dakle tabela 10x10, 0 u prvom polju, 81 u poslednjem polju)*/

    public static void main(String[] args) {

        int rows = 10;
        int columns = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int result = i * j;
                System.out.print(result + "\t");
            }
            System.out.println();
        }

    }

}
