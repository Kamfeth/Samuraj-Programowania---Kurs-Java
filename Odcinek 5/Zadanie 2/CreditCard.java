public class CreditCard {
    private int accountBalance = 5318008;

    public boolean checkCard(String cardId) {
        return cardId.equals("GMD");
    }

    public boolean checkAccountBalance(int cash) {
        return cash <= accountBalance ;
    }

    public void withdrawMoney(int cash) {
        accountBalance  -= cash;
    }

    public void showAccountBalance() {
        if (accountBalance  == 0) {
            System.out.print("Skończyły Ci się pieniądze. Do widzenia!");
            System.exit(0);
        }
        System.out.println("\nStan twojego konta wynosi " + accountBalance  + " zł.");
    }
}
