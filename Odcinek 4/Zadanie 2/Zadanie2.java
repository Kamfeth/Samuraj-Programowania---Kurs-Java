import java.util.*;

public class Zadanie2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++)
            numbers[i] = in.nextInt();
        Arrays.sort(numbers);
        for (int number : numbers)
            System.out.println(number);
    }
}
