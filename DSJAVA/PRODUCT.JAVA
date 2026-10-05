class Product {
    private String productId;
    private String productName;
    private double price;
    private int quantity;

    public Product(String productId, String productName, double price, int quantity) {
        this.productId = productId;
        this.productName = productName;

        if (price >= 0) {
            this.price = price;
        }

        if (quantity >= 0) {
            this.quantity = quantity;
        }
    }

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
}

class ProductManagementSystem {
    public static void main(String[] args) {

        Product product1 = new Product("1001", "BMW", 9000, 5);
        Product product2 = new Product("1002", "HOUSE", 2000, 2);
        Product product3 = new Product("1003", "Jewellery", 3500, 700);

        product1.displayProduct();
        product2.displayProduct();
        product3.displayProduct();
    }
}