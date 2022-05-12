import java.util.Scanner;
import java.util.Random;
public class BankAccount {
    static Scanner s = new Scanner(System.in);
    static Random rand = new Random();
    private double balance;
    private String customerName;
    private int accountNumber;

    public BankAccount (double balance, String customerName, int accountNumber) {
        this.balance = balance;
        this.customerName = customerName;
        this.accountNumber = accountNumber;
    }

    public BankAccount() {
        System.out.println("Thank you for your interest in banking with THE BANK.");
        System.out.println("What is the name for the account?");
        customerName = s.nextLine();
        System.out.println("What is the beginning balance on the account?");
        balance = Integer.parseInt(s.nextLine());
        accountNumber = generateAccountNum();

    }

    public int generateAccountNum() {
        return rand.nextInt(1000000);
    }
    public void deposit (double amount) {
        balance += amount;
    }

    public void withdrawal (double amount) {
        balance -= amount;
    }

    public void transfer (BankAccount transferTo, double amount) {
        withdrawal(amount);
        transferTo.deposit(amount);
    }

    public String getCustomerName(){
        return customerName;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public String toString() {
        return customerName +"'s account balance: " + balance;
    }
}
