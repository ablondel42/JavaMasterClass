package List_ArrayList_LinkedList_Iterator_Autoboxing.Banking;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName, double initialTransaction) {
        // Returns true if the customer was added successfully or false otherwise.
        if (findCustomer(customerName) == null) {
            customers.add(new Customer(customerName, initialTransaction));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transactionAmount) {
        // Returns true if the customers transaction was added successfully or false otherwise.
        Customer customer = findCustomer(customerName);
        if (customer != null) {
            customer.addTransaction(transactionAmount);
            return true;
        }
        return false;
    }

    private Customer findCustomer(String customerName) {
        // Returns a Customer if it exists or null otherwise.
        for (Customer customer: customers) {
            if (customer.getName().equals(customerName)) {
                return customer;
            }
        }
        return null;
    }
}
