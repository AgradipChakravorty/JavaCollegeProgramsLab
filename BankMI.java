// Bank Interface
interface Bank {
    void displayBankDetails();
    void displayInterestRate();
}

// Customer Class implementing Bank interface
class Customer implements Bank {
    private String name;
    private int customerId;

    public Customer(String name, int customerId) {
        this.name = name;
        this.customerId = customerId;
    }

    @Override
    public void displayBankDetails() {
        System.out.println("Bank Name: ABC Bank");
        System.out.println("Customer Name: " + name);
        System.out.println("Customer ID: " + customerId);
    }

    @Override
    public void displayInterestRate() {
        System.out.println("Interest Rate for Customer: 5%");
    }
}

// Account Class implementing Bank interface
class Account implements Bank {
    private int accountNumber;
    private double balance;

    public Account(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    @Override
    public void displayBankDetails() {
        System.out.println("Bank Name: ABC Bank");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }

    @Override
    public void displayInterestRate() {
        System.out.println("Interest Rate for Account: 3.5%");
    }
}


public class BankMI {
    public static void main(String[] args) {
        Customer cust = new Customer("John Doe", 101);
        Account acc = new Account(5001, 2500.75);

        System.out.println("Customer Details:");
        cust.displayBankDetails();
        cust.displayInterestRate();

        System.out.println("\nAccount Details:");
        acc.displayBankDetails();
        acc.displayInterestRate();
    }
}