package Bai2_5;

public class Main {
    public static void main(String[] args) {

        Customer customer1 = new Customer(101, "Alice");

        Account account1 = new Account(1001, customer1, 500.0);

        System.out.println("Initial Account Details:");
        System.out.println(account1);

        account1.deposit(200.0);
        System.out.println("\nAfter Depositing $200:");
        System.out.println(account1);

        account1.withdraw(150.0);
        System.out.println("\nAfter Withdrawing $150:");
        System.out.println(account1);

        account1.withdraw(600.0);
        System.out.println("\nAfter Attempting to Withdraw $600:");
        System.out.println(account1);

        System.out.println("\nCustomer Name: " + account1.getCustomername());
    }
}