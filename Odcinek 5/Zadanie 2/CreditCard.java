public class CreditCard {
    private int money = 2137;

    public boolean checkCard(String cardId) {
        return cardId.equals("GMD");
    }

    public boolean checkAccountBalance(int cash) {
        return cash <= money;
    }

    public void withdrawMoney(int cash) {
        money -= cash;
    }

    public void showAccountBalance() {
        if (money == 0) {
            System.out.print("Skończyły Ci się pieniądze. Do widzenia!");
            System.exit(0);
        }
        System.out.println("\nStan twojego konta wynosi " + money + " zł.");
    }
}
