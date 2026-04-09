class Account {
    private double balance;

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class Encap2 {
    public static void main(String[] args) {

        Account acc = new Account();

        acc.deposit(5000);
        acc.withdraw(2000);

        System.out.println("Balance: " + acc.getBalance());
    }
}