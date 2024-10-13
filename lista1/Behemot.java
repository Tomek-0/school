import java.util.Arrays;

public class Behemot {

    private int[] array; // Pole do przechowywania tablicy

    // Konstruktor klasy Behemot przyjmujący tablicę
    public Behemot(int[] array) {
        this.array = array;
    }

    // Metoda sortująca tablicę
    public void sort() {
        Arrays.sort(array);
    }

    // Metoda do wypisania tablicy
    public void printArray() {
        System.out.print("{");
        // Jeśli tablica jest pusta, wypisz "empty"
        if (array.length == 0) {
            System.out.print("empty");
        }
        // W przeciwnym wypadku wypisz elementy tablicy
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
