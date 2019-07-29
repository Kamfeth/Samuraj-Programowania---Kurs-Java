import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        String surname = in.next();
        int telephone = in.nextInt();
        System.out.println("_________________________________________");
        System.out.println("--> Imię i nazwisko: " + name + " " + surname + " <--");
        System.out.println("--> Numer telefonu: " + telephone + " <--");
        System.out.println("_________________________________________");
    }
}
