public class Main {

    // Tablica liczb losowych
    int array[] = {78, 12, 45, 34, 23, 99, 7, 53, 18, 44, 69, 27, 60, 41, 90, 5, 85, 25, 37, 80, 13, 92, 9, 55, 16, 62, 68, 66, 87, 56, 91, 39, 48, 83, 64, 2, 58, 71, 28, 11, 97, 1, 36, 47, 50, 31, 26, 88, 35, 93, 49, 98, 100, 77, 10, 19, 42, 54, 3, 57, 63, 84, 29, 73, 22, 17, 74, 43, 94, 96, 21, 82, 20, 59, 6, 32, 95, 4, 38, 70, 46, 33, 24, 89, 65, 86, 76, 14, 75, 8, 67, 15, 51, 61, 72, 40, 81, 52, 30, 79};

    public static void main(String[] args) {
        // Inicjalizacja obiektu klasy Behemot
        Main main = new Main();
        Behemot behemot = new Behemot(main.array);

        // Wywołanie metody sortującej
        behemot.sort();

        // Wypisanie posortowanej tablicy
        behemot.printArray();
    }
}
