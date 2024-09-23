package Abstraction.Store;

public class ProductB extends ProductForSale {
    public ProductB() {
        super("B", 125.0, "Product B");
    }

    @Override
    void showDetails() {
        System.out.println(getType());
        System.out.println(getDescription());
        System.out.println(getPrice());
    }
}
