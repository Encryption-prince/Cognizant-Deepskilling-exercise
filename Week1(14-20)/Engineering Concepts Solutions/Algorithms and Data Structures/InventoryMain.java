import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Product {
    private int productId;
    private String productName;
    private int quantity;
    private double price;

    // Constructor
    public Product() {
        productId = (int) Math.random();
        productName = "";
        quantity = 0;
        price = 0.0;
    }

    public Product(int productId, String productName, int quantity, double price) {
        this.productId = productId;
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    // Getters and Setters
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}

class CrudFeatures {
    List<Product> products = new ArrayList<>();

    public void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Id : ");
        int productId = sc.nextInt();
        System.out.print("Enter Product Name : ");
        sc.nextLine();
        String productName = sc.nextLine();
        System.out.print("Enter Product Quantity : ");
        int quantity = sc.nextInt();
        System.out.print("Enter Product Price : ");
        double price = sc.nextDouble();
        Product product = new Product(productId, productName, quantity, price);
        products.add(product);
        System.out.println("Product Added Successfully");
    }

    public void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Id : ");
        int productId = sc.nextInt();
        for (Product p : products) {
            if (p.getProductId() == productId) {
                products.remove(p);
                break;
            }

        }
        System.out.println("Product Deleted Successfully");
    }

    public void updateProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Product Id : ");
        int productId = sc.nextInt();

        for (Product p : products) {
            if (p.getProductId() == productId) {
                System.out.print("Enter Product Name : ");
                String productName = sc.nextLine();
                System.out.print("Enter Product Quantity : ");
                int quantity = sc.nextInt();
                System.out.print("Enter Product Price : ");
                double price = sc.nextDouble();
                // Updation
                p.setProductName(productName);
                p.setQuantity(quantity);
                p.setPrice(price);
            }

        }
        System.out.println("Product Updated Successfully");
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

public class InventoryMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        CrudFeatures c = new CrudFeatures();
        System.out.println("---Inventory Management System---");
        do {
            System.out.println("1.Add Product\n2.Update Product\n3.Delete Product\n4.View Warehouse\n5.EXIT");
            System.out.print("Enter Choice : ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    c.addProduct();
                    System.out.println();
                    break;
                case 2:
                    c.updateProduct();
                    System.out.println();
                    break;
                case 3:
                    c.deleteProduct();
                    System.out.println();
                    break;
                case 4:
                    for (Product p : c.getAllProducts()) {
                        System.out.println("Id: " + p.getProductId() + ", Name: " + p.getProductName() + ", Quantity: "
                                + p.getQuantity() + ", Price: " + p.getPrice());
                    }
                    System.out.println();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Request!! Please Try Again");
            }
        } while (choice != 5);
        sc.close();
    }
}