package JavaProgramming.JavaWeek2.domaci3;

public class Zadatak2_D_08_Ognjen_Curcic_ITBG17018 {

    /*Zadatak 2:
    Napisati funkciju koja ce primiti niz celih brojeva, i broj koji zelimo da lociramo unutar tog
    niza. Ukoliko prolaskom kroz niz naidjemo na pogresan broj, ispisati poruku da je pogresan
    element, cim naidjemo na zadati element, ispisati poruku da je pronadjen i zavrsiti funkciju
    (Cim naidje na taj element, ne treba da ga trazi dalje).*/

    static void pronadjiBroj(int[] array, int target) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == target) {
                System.out.println("Broj " + target + " je pronadjen");
                return; // Exit the function when the target is found
            } else {
                System.out.println("Element je pogresan: " + array[i]);
            }
        }
    }
    public static void main(String[] args) {

        int[] numbers = {16, 123, -55, 11, 777};
        int target = 11;

        pronadjiBroj(numbers, target);
    }
}
