package Products;

public abstract class Product {
    private final int id;
    private String name;
    private double price;
    private int stock;

    private static int nextId = 1;

    public Product(String name, double price, int stock) {
        this.id = nextId++;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    /**
     * Returns a string representation of the Product object, showing its
     * common attributes (ID, Name, Price, and Stock).
     *
     * @return A formatted string containing the product's core details.
     */
    @Override
    public String toString() {
        return String.format("ID: %d | Name: %s | Price: $%.2f | Stock: %d", id, name, price, stock);
    }

    /**
     * Returns a string containing specific details about the product that
     * are not shown by the standard {@link #toString()} method.
     *
     * @return A string containing specific details about the product.
     */
    public abstract String getSpecificDetails();

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getStock() {
        return stock;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
