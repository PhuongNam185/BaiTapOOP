package chapter1bai1_6;

public class Account {
    private String id;
    private String name;
    private int balance=0;
    public Account(String id, String name, int i) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount) {
        balance = balance + amount;
        return amount;
    }
    public int debit(int amount) {
        if (amount <= balance) {
            balance = balance - amount;
        } else {
            System.out.println("Amount exceeded balance ");
        }
    return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public int transferTo (Account another, int amount) {
        if (amount <= balance) {
            balance = balance - amount;
            another.credit(amount);
        }else {
            System.out.println("Amount exceeded balance ");
        }
        return balance;


}

}
