import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        int number = in.nextInt();
        System.out.print("Czy wydrukować wprowadzony tekst? (1 = Tak, 2 = Nie) ");
        int answer = in.nextInt();
        while (answer != 1 && answer != 2) {
            System.out.print("Nie zrozumiałem, wybierz odpowiedź jeszcze raz: ");
            answer = in.nextInt();
        }
        if (answer == 1) {
            for (int i = 0; i < number; i++)
                System.out.println(str);
        }
    }
}
