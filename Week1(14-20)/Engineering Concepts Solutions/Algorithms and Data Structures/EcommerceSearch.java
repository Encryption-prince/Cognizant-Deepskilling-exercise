import java.util.Scanner;

class Product {

    private int productId;
    private String productName;
    private String category;

    public Product(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

}

public class EcommerceSearch {

    // Linear Search
    public static Product linearSearch(Product[] products, String targetName) {
        for (Product p : products) {
            if (p.getProductName().equalsIgnoreCase(targetName)) {
                return p;
            }
        }
        return null;
    }

    // Binary Search
    public static Product binarySearch(Product[] products, String target) {
        int left = 0, right = products.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            int compare = products[mid].getProductName().compareToIgnoreCase(target);
            if (compare == 0)
                return products[mid];
            else if (compare < 0)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return null;
    }

    public static void sortProductsByName(Product[] products) {
        int n = products.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (products[j].getProductName().compareToIgnoreCase(products[j + 1].getProductName()) > 0) {
                    Product temp = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();
        sc.nextLine();

        Product[] products = new Product[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for product " + (i + 1) + ":");
            System.out.print("Product ID : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Product Name : ");
            String name = sc.nextLine();
            System.out.print("Category : ");
            String category = sc.nextLine();
            products[i] = new Product(id, name, category);
        }

        // Linear Searching product
        System.out.print("\nEnter product name to search (Linear Search) : ");
        String searchName1 = sc.nextLine();
        long startTimeLinear = System.nanoTime();
        Product result1 = linearSearch(products, searchName1);
        long endTimeLinear = System.nanoTime();

        if (result1 != null)
            System.out.println("Found : " + result1.getProductName() + " in category " + result1.getCategory());
        else
            System.out.println("Product not found (Linear Search)");

        System.out.println("Time taken for Linear Search : " + (endTimeLinear - startTimeLinear) + " nanoseconds");

        // Binary Searching Product
        System.out.print("\nEnter product name to search (Binary Search) : ");
        String searchName2 = sc.nextLine();
        sortProductsByName(products);
        long startTimeBinary = System.nanoTime();
        Product result2 = binarySearch(products, searchName2);
        long endTimeBinary = System.nanoTime();

        if (result2 != null)
            System.out.println("Found: " + result2.getProductName() + " in category " + result2.getCategory());
        else
            System.out.println("Product not found (Binary Search)");

        System.out.println("Time taken for Binary Search : " + (endTimeBinary - startTimeBinary) + " nanoseconds");

        sc.close();
    }
}
