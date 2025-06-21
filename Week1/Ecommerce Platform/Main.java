package app;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Product[] products = {
            new Product(105, "Shoes", "Footwear"),
            new Product(101, "Laptop", "Electronics"),
            new Product(109, "Keyboard", "Electronics"),
            new Product(104, "T-Shirt", "Apparel"),
            new Product(102, "Phone", "Electronics"),
            new Product(108, "Watch", "Accessories"),
            new Product(107, "Backpack", "Bags"),
            new Product(103, "Mouse", "Electronics"),
            new Product(106, "Jeans", "Apparel")
        };

        ProductSearchUtils.printProducts(products);

        Product foundLinear = LinearSearch.searchById(products, 104);
        System.out.println("Linear Search by ID (104): " + (foundLinear != null ? foundLinear : "Not Found"));

        Product foundByName = LinearSearch.searchByName(products, "Watch");
        System.out.println("Linear Search by Name (Watch): " + (foundByName != null ? foundByName : "Not Found"));

        Arrays.sort(products, Comparator.comparingInt(p -> p.productId));

        Product foundBinary = BinarySearch.searchById(products, 102);
        System.out.println("Binary Search by ID (102): " + (foundBinary != null ? foundBinary : "Not Found"));
    }
}
