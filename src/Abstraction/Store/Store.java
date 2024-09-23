package Abstraction.Store;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        Store store = new Store();
        store.products.add(new ProductA());
        store.products.add(new ProductB());
        store.products.add(new ProductC());
        addItemToOrder(3, store.products.get(0));
        addItemToOrder(2, store.products.get(1));
        addItemToOrder(1, store.products.get(2));
        printOrder();
    }

    private final ArrayList<ProductForSale> products;
    private static ArrayList<OrderItem> orderItems;

    public Store() {
        products = new ArrayList<>();
        orderItems = new ArrayList<>();
    }

    public static void addItemToOrder(int qty, ProductForSale product) {
        orderItems.add(new OrderItem(qty, product));
    }

    public static void printOrder() {
        for (OrderItem item: orderItems) {
            item.product().printPricedItem(item.qty());
        }
    }
}
