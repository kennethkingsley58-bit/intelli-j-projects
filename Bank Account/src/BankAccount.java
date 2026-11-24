
public class BankAccount {

    public int balance;

    public int getBalance() {
        return balance;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
        }
        return balance;
    }
}
