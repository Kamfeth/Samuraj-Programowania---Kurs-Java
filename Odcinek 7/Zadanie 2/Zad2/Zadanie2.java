package Zad2;

public class Zadanie2 {
    public static void main(String[] args) {
        System.out.print("9! jest równe " + factorial(9));
    }

    public static int factorial(int n) {
        if (n <= 1)
            return 1;
        else
            return n * factorial(n - 1);
    }
}
