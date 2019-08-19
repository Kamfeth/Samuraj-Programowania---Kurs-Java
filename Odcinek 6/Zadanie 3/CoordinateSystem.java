public class CoordinateSystem {
    public static void main(String[] args) {
        Point3D[] points = new Point3D[3];
        for (int i = 0; i < 3; i++) {
            points[i] = new Point3D(i + 2, i + 3, i + 4);
            System.out.println("Nazwa klasy oraz jej adres: " + points[i]);
            System.out.println("Wartość X: " + points[i].getX());
            System.out.println("Wartość Y: " + points[i].getY());
            System.out.println("Wartość Z: " + points[i].getZ() + "\n");
        }
    }
}
