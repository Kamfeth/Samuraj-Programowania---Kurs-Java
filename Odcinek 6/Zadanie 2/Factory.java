public class Factory {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Product[] products = new Product[100];
        factory.createOneHundredProducts(products);
        factory.testProducts(products);
    }

    private void createOneHundredProducts(Product[] products) {
        for (int i = 0; i < 100; i++)
            products[i] = new Product();
    }

    private void testProducts(Product[] products) {
        products[21].run();
        products[37].run();
        products[42].run();
    }
}
