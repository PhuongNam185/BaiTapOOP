package chapter2bai2_5;

public class TestMain {
    public static void main(String[] args) {
        // Tạo một đối tượng Account
        Account account = new Account(123456, "Alice");

        // Kiểm tra các phương thức của lớp Account
        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Initial Balance: " + account.getBalance());

        // Thử phương thức deposit
        account.deposit(500.0);
        System.out.println("Balance after Deposit: " + account.getBalance());

        // Thử phương thức withdraw
        account.withdraw(200.0);
        System.out.println("Balance after Withdrawal: " + account.getBalance());

        // Thử rút số tiền lớn hơn số dư hiện có
        account.withdraw(400.0);
        System.out.println("Final Account Info: " + account.toString());
    }
}
