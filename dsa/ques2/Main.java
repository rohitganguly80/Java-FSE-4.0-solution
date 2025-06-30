package dsa.ques2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Laptop", "Electronics"));
        products.add(new Product(2, "Shoes", "Footwear"));
        products.add(new Product(3, "Phone", "Electronics"));
        products.add(new Product(4, "Watch", "Accessories"));

        // Linear Search
        Product result1 = Product.linearSearch(products, "Phone");
        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

        // Binary Search
        Product result2 = Product.binarySearch(products, "Phone");
        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));
    }
}