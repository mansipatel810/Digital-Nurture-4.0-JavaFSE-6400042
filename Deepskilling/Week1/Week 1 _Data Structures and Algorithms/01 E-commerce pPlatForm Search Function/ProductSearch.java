import java.util.*;

public class ProductSearch {

    public static Product linearSearch(List<Product> products, String name) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(name)) {
                return p;
            }
        }
        return null;
    }

    public static Product binarySearch(List<Product> products, String name) {
        int low = 0, high = products.size() - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            Product midProduct = products.get(mid);
            int cmp = midProduct.getProductName().compareToIgnoreCase(name);

            if (cmp == 0) {
                return midProduct;
            } else if (cmp < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Laptop", "Electronics"));
        productList.add(new Product(2, "Washing Machine", "Home"));
        productList.add(new Product(3, "Shoes", "Fashion"));
        productList.add(new Product(4, "Smartphone", "Electronics"));
        productList.add(new Product(5, "Backpack", "Accessories"));

        // Sorting list for binary search
        productList.sort(Comparator.comparing(Product::getProductName));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter product name to search: ");
        String inputName = scanner.nextLine();

        Product foundLinear = linearSearch(productList, inputName);
        if (foundLinear != null) {
            foundLinear.showDetails();
        } else {
            System.out.println("Product not found");
        }

        Product foundBinary = binarySearch(productList, inputName);
        if (foundBinary != null) {
            foundBinary.showDetails();
        } else {
            System.out.println("Product not found");
        }
    }
}
