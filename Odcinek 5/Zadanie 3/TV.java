public class TV {
    private int volumeLevel = 8;
    private int selectedChannel = 0;
    private RemoteControl rc;

    public void showAvailableOptions() {
        System.out.println("Proszę wybrać jeden z podanych przycisków: ");
        System.out.println("\nPrzyciski numeryczne od 0 do 9 : Wybranie poszczególnego kanału.");
        System.out.println("Przyciski + lub - : Zwiększenie lub zmniejszenie poziomu głośności.");
        System.out.println("Przyciski ^ lub v : Zmiana kanału w górę lub w dół.");
        System.out.println("Przycisk on/off : Włącza lub wyłącza telewizor:");
        System.out.print("\nProszę wybrać odpowiedni przycisk: ");
        takeAction();
    }

    private void takeAction() {
        rc = new RemoteControl();
        String choice = rc.selectedButton();
        if (choice.equals("+") || choice.equals("-"))
            changeVolume(choice);
        else if (choice.equals("^") || choice.equals("v"))
            changeChannel(choice);
        else if (choice.equals("on/off"))
            turnOffTV(choice);
        else {
            System.out.println(showChannel(choice));
            showAvailableOptions();
        }
    }

    private void changeVolume(String choice) {
        if (choice.equals("+") && volumeLevel != 15)
            volumeLevel++;
        else if (choice.equals("-") && volumeLevel != 1)
            volumeLevel--;
        System.out.println("\nPoziom głośności: " + volumeLevel + "\n");
        showAvailableOptions();
    }

    private void changeChannel(String choice) {
        if (choice.equals("^")) {
            selectedChannel++;
            if (selectedChannel == 10)
                selectedChannel = 0;
        } else {
            selectedChannel--;
            if (selectedChannel == -1)
                selectedChannel = 9;
        }
        String temp = Integer.toString(selectedChannel);
        System.out.println(showChannel(temp));
        showAvailableOptions();
    }

    private void turnOffTV(String choice) {
        System.out.print("Wyłącznie telewizora... Do następnego razu!");
        System.exit(0);
    }

    private String showChannel(String choice) {
        switch (choice) {
            case "0":
                selectedChannel = 0;
                return "\nKanał: TVP Kultura\n";
            case "1":
                selectedChannel = 1;
                return "\nKanał: TVP 1\n";
            case "2":
                selectedChannel = 2;
                return "\nKanał: TVP 2\n";
            case "3":
                selectedChannel = 3;
                return "\nKanał: Polsat\n";
            case "4":
                selectedChannel = 4;
                return "\nKanał: TV 4\n";
            case "5":
                selectedChannel = 5;
                return "\nKanał: TVN\n";
            case "6":
                selectedChannel = 6;
                return "\nKanał: TVN Turbo\n";
            case "7":
                selectedChannel = 7;
                return "\nKanał: TVN 7\n";
            case "8":
                selectedChannel = 8;
                return "\nKanał: National Geographic\n";
            case "9":
                selectedChannel = 9;
                return "\nKanał: Eska TV\n";
            default:
                return "\nWybrany przycisk wykracza poza podany zakres!\n";
        }
    }
}
