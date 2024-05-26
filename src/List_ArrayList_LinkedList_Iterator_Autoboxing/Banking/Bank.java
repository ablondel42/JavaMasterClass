package List_ArrayList_LinkedList_Iterator_Autoboxing.Banking;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            branches.add(new Branch(branchName));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        // Returns true if the customer was added successfully or false otherwise.
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transactionAmount) {
        // Returns true if the customers transaction was added successfully or false otherwise.
        Branch branch = findBranch(branchName);
        if (branch != null) {
            ArrayList<Customer> customerList = branch.getCustomers();
            for (Customer customer: customerList) {
                if (customer.getName().equals(customerName)) {
                    customer.addTransaction(transactionAmount);
                    return true;
                }
            }
        }
        return false;
    }

    private Branch findBranch(String branchName) {
        // Returns the branch if it exists or null otherwise.
        for (Branch branch : branches) {
            if (branch.getName().equals(branchName)) {
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printDetailedTransactions) {
        // Returns true if the branch exists or false otherwise. This method prints out a list of customers.
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> customerList = branch.getCustomers();
            if (printDetailedTransactions) {
                // double for loop -> 1 print customer -> 2 print each transaction for each customer
                int customerIndex = 1;
                for (Customer customer: customerList) {
                    int transactionIndex = 1;
                    System.out.println("Customer: " + customer.getName() + "[" + customerIndex + "]");
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = customer.getTransactions();
                    for (Double transaction: transactions) {
                        System.out.println("[" + transactionIndex + "] Amount " + transaction);
                        transactionIndex++;
                    }
                    customerIndex++;
                }
            } else {
                // single for loop -> print each customer
                int customerIndex = 1;
                for (Customer customer: customerList) {
                    System.out.println("Customer: " + customer.getName() + "[" + customerIndex + "]");
                    customerIndex++;
                }
            }
            return true;
        }
        return false;
    }
}
