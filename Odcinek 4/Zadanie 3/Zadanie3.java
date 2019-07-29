import java.util.Scanner;

public class Zadanie3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int pointsForStyle = in.nextInt();
        int pointsForEffects = in.nextInt();
        int pointsForResult = in.nextInt();
        System.out.print(pointsForStyle * 0.2 + pointsForEffects * 0.3 + pointsForResult * 0.5);
    }
}
