import java.util.Scanner;

public class RemoteControl {
    private Scanner in;

    public String selectedButton() {
        in = new Scanner(System.in);
        String button = in.next();
        return button;
    }
}
