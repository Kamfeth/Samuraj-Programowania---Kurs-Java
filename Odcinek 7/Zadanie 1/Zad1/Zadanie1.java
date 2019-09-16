package Zad1;

import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        int number = Integer.parseInt(getText());
        System.out.print(number);
    }

    public static String getText() {
        System.out.print("Proszę podać liczbę: ");
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
