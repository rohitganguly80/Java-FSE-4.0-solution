package dsa.ques2;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Product {
    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", category='" + category + '\'' +
                '}';
    }

    // Linear Search Method
    public static Product linearSearch(List<Product> products, String targetName) {
        for (Product p : products) {
            if (p.productName.equalsIgnoreCase(targetName)) return p;
        }
        return null;
    }

    // Binary Search Method
    public static Product binarySearch(List<Product> products, String targetName) {
        // Sort list by productName (case-insensitive)
        products.sort(Comparator.comparing(p -> p.productName.toLowerCase()));

        int low = 0, high = products.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products.get(mid);
            int cmp = targetName.compareToIgnoreCase(midProduct.productName);

            if (cmp == 0) return midProduct;
            else if (cmp < 0) high = mid - 1;
            else low = mid + 1;
        }

        return null;
    }
}