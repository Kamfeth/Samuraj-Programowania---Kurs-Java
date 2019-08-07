import java.util.Scanner;

public class ATM {
    private int cash;
    private Scanner in = new Scanner(System.in);
    private CreditCard cc = new CreditCard();

    public void startupMessage() {
        System.out.print("Włóż kartę: ");
        String cardId = in.next();
        if (cc.checkCard(cardId))
            showMenu();
        else {
            System.out.println("Nieprawidłowy kod karty, spróbuj ponownie: ");
            startupMessage();
        }
    }

    private void showMenu() {
        System.out.println("Wypłać pieniądze (1)");
        System.out.println("Stan konta (2)");
        System.out.print("\nProszę wybrać odpowiedni numer opcji: ");
        int choice = in.nextInt();
        switch (choice) {
            case 1:
                System.out.print("Wprowadź odpowiednią ilość pieniędzy: ");
                cash = in.nextInt();
                if (cc.checkAccountBalance(cash)) {
                    cc.withdrawMoney(cash);
                    System.out.println("Wypłaciłeś z konta " + cash + " zł.");
                }
                else
                    System.out.println("Nie posiadasz wystarczającej ilości pieniędzy!");
                showMenu();
            case 2:
                cc.showAccountBalance();
                showMenu();
            default:
                System.out.println("Wybrano nieprawidłową opcję.\n");
                showMenu();
        }
    }
}
