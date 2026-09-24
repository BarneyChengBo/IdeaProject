package exerciseInClassBoolean3;

public class BankAccount {
    private double balance;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public void printBalance(){
        System.out.println("The balance is " + balance);
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Your balance: " + balance);
        } else {
            System.out.println("Please enter a valid number.");
        }
    }


    public void withdraw(double amount) {
        if ( amount > 0 && amount <= balance){
            balance -= amount;
            System.out.println("Your balance: " + balance);
        } else {
            System.out.println("The entered value exceeds the balance!");
        }
    }

    public double getBalance(){
        return balance;
    }







}
