public class Program {

    public static void main(String[] args) {
        BankAccount account = new BankAccount(12345678, 1000, "Yana", 0.1);

        account.deposit(500);
        account.withdraw(300);
        account.addInterest();
        double balance = account.getBalance();
        System.out.println(balance);
    }
}
