package Abstraction.Store;

public abstract class ProductForSale {
    private final String type;
    private final double price;
    private final String description;

    public ProductForSale(String type, double price, String description) {
        this.type = type;
        this.price = price;
        this.description = description;
    }

    public void printPricedItem(int qty) {
        System.out.println("Item " + type + " x " + qty + ": " + getSalesPrice(qty));
    }

    public double getSalesPrice(int qty) {
        return price * qty;
    }

    abstract void showDetails();

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }
}
