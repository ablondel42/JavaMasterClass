package Abstraction.Store;

public class ProductC extends ProductForSale {
    public ProductC() {
        super("C", 150.0, "Product C");
    }

    @Override
    void showDetails() {
        System.out.println(getType());
        System.out.println(getDescription());
        System.out.println(getPrice());
    }
}
