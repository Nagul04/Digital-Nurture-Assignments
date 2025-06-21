package app;

public class ProductSearchUtils {
    public static void printProducts(Product[] products) {
        System.out.println("Available Products:");
        for (Product product : products) {
            System.out.println("- " + product);
        }
        System.out.println("----------------------------");
    }
}
