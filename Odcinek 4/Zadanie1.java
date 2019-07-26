import java.util.Scanner;

public class Zadanie1 {
    public static void main(String[] args) {
        System.out.print("Proszę wprowadzić liczbę naturalną: ");
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        if (isPrime(number) && number > 1 && number != 4)
            System.out.print("Liczba " + number + " jest liczbą pierwszą.");
        else
            System.out.print("Liczba " + number + " nie jest liczbą pierwszą.");
    }

    static boolean isPrime(int number) {
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }
}
