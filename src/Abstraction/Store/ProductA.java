package Abstraction.Store;

public class ProductA extends ProductForSale {
    public ProductA() {
        super("A", 100.0, "Product A");
    }

    @Override
    void showDetails() {
        System.out.println(getType());
        System.out.println(getDescription());
        System.out.println(getPrice());
    }
}
