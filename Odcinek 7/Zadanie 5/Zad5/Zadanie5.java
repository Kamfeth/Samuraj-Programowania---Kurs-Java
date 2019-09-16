package Zad5;

public class Zadanie5 {
    public static void main(String[] args) {
        int[] numbers = {2, 3, 5, 7, 9, 1, 9, 9, 9};
        System.out.print("Liczba 9 w przekazanej tablicy występuje " + count9(numbers) + " razy.");
    }

    public static int count9(int[] numbers) {
        int counter = 0;
        for (int number : numbers) {
            if (number == 9)
                counter++;
        }
        return counter;
    }
}
