package exerciseInClassBoolean3;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(100.00);
        myAccount.printBalance();
        myAccount.setBalance(500.00);
        myAccount.printBalance();
        myAccount.withdraw(-50);
        myAccount.deposit(0.5);

        System.out.println(myAccount.getBalance());



    }
}
