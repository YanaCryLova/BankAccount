public class BankAccount {

    int accountNumber;
    double balance;
    String ownerName;
    double interestRate;
    BankAccount (int accNum, double bal, String name, double intRate) {
        this.accountNumber = accNum;
        this.balance = bal;
        this.ownerName = name;
        this.interestRate = intRate;
    }
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public void addInterest() {
        balance += balance * interestRate;
    }

    public double getBalance() {
        return balance;
    }
}