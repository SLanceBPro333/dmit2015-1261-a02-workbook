package dmit2015.model;

public class BankAccount {
    private double balance = 0;
    public void deposit(double amount) {
        if (amount < 0) throw new RuntimeException("Negative deposit not allowed");
        balance += amount;
    }
    public void withdraw(double amount) {
        if (amount > balance) throw new RuntimeException("Insufficient funds");
        balance -= amount;
    }
    public double getBalance() { return balance; }
}
