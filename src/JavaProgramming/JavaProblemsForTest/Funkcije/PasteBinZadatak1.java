package JavaProgramming.JavaProblemsForTest.Funkcije;

import java.util.ArrayList;

public class PasteBinZadatak1 {

    //1. Napisati fukciju koja prima ArrayListu integera i ispisuje sve njene elemente.

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(5);
        lista.add(10);
        lista.add(15);

        ispisiElemente(lista);
    }

    public static void ispisiElemente(ArrayList<Integer> lista) {
        for (Integer element : lista) {
            System.out.println(element);
        }
    }
}











