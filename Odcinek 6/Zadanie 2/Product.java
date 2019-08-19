public class Product {
    private static int id = 0;
    private int uniqueIdNumer;
    private final String productName = "Watch";

    public Product() {
        uniqueIdNumer = ++id;
    }

    public void run() {
        System.out.println("Nazwa produktu: " + productName);
        System.out.println("Numer ID: " + id);
        System.out.println("Unikalny numer ID: " + uniqueIdNumer + "\n");
    }
}
