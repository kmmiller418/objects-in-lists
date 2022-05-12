import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    private static Scanner s = new Scanner(System.in);
    private static ArrayList<BankAccount> accounts = new ArrayList<>();
    public static void main(String[] args) {

        accounts.add(new BankAccount(500, "Kaneka", 1));
        accounts.add(new BankAccount(5000, "Larry", 2));
        accounts.add(new BankAccount(400, "Mary",3));


        System.out.println("Hello! Welcome to THE BANK!");
        System.out.println("Are you an existing customer already banking with THE BANK? (-1 to exit)");
        System.out.println("1. Yes");
        System.out.println("2. No");

        String reply = s.nextLine();

        if (reply.equals("1")){
            System.out.println("Great! Thank you for being a valued member of THE BANK");
            System.out.println("What is your account number?");
            int accountNum = Integer.parseInt(s.nextLine());

            BankAccount account = Main.findAccount(accountNum);
            if (account == null) {
                System.out.println("Sorry, that account does not exist with THE BANK");
                System.out.println("Please try again next moon.");
            }
            Main.mainMenu(account);

        } else if (reply.equals("2")) {

            BankAccount newAccount = new BankAccount();
            System.out.println("Thank you for your interest in banking with THE BANK.");

            System.out.println("What is the name for the account?");
            String customerName = s.nextLine();
            System.out.println("What is the beginning balance on the account?");
            int balance = Integer.parseInt(s.nextLine());

            newAccount.setCustomerName(customerName);
            newAccount.setBalance(balance);

            accounts.add(newAccount);
            Main.mainMenu(newAccount);
        }
    }
    public static void mainMenu(BankAccount account) {
        System.out.println("Hello " + account.getCustomerName());
        while (true) {
            System.out.println("What would you like to do today?");
            System.out.println("1. To check account balance.");
            System.out.println("2. To make a withdrawal.");
            System.out.println("3. To make a deposit.");
            System.out.println("4. To make a transfer to another account.");
            System.out.println("0. To exit.");

            int response = Integer.parseInt(s.nextLine());

            switch (response) {
                case 1:
                    System.out.println("Your current balance is: " + account.getBalance());
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw?");
                    Double amount = Double.parseDouble(s.nextLine());
                    if (amount > account.getBalance()) {
                        System.out.println("Sorry, you cannot withdraw that much. Your balance is: " + account.getBalance());
                        break;
                    }
                    account.withdrawal(amount);
                    System.out.println("Your new balance is: " + account.getBalance());
                    break;
                case 3:
                    System.out.println("How much would you like to deposit?");
                    account.deposit(Double.parseDouble(s.nextLine()));
                    System.out.println("Your new balance is: " + account.getBalance());
                    break;
                case 4:
                    System.out.println("What account would you like to transfer to?");
                    int accountNum = Integer.parseInt(s.nextLine());
                    BankAccount transferTo = Main.findAccount(accountNum);
                    if (transferTo == null) {
                        System.out.println("Sorry, that account does not exist with THE BANK");
                    } else {
                        System.out.println("How much would you like to transfer?");
                        Double transferAmount = Double.parseDouble(s.nextLine());
                        if (transferAmount > account.getBalance()) {
                            System.out.println("Sorry, you cannot transfer that much. Your balance is: " + account.getBalance());
                            break;
                        }
                        account.transfer(transferTo, transferAmount);
                        System.out.println("Your new balance is " + account.getBalance());
                    }
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Sorry, that wasn't an option.");
            }
        }
    }

    private static BankAccount findAccount(int accountNum) {
        for (BankAccount account : accounts){
            if (account.getAccountNumber() == accountNum) {
                return account;
            }
        }
        return null;
    }
}
