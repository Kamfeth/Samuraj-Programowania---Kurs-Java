package Zad4;

public class Zadanie4 {
    public static void main(String[] args) {
        IClick click = new IClick() {
            public void onRightButtonClick() {
                System.out.println("Wciśnięto prawy przycisk myszy.");
            }
            
            public void onLeftButtonClick() {
                System.out.println("Wciśnięto lewy przycisk myszy.");
            }
        };
    }
}
