package chapter2bai2_4;

public class Customer {
    private int id;
    private String name;
    private int discount;
    public Customer(int id, String name, int discount) {
        this.id = id;
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getDiscount() {
        return discount;
    }
    public void setDiscount (int discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }
    class Invoice {
        private int id;
        private Customer customer;
        private double amount;
        public Invoice(int id, Customer customer, double amount) {
            this.id = id;
            this.customer = customer;
            this.amount = amount;
        }
        public int getId() {
            return id;
        }
        public Customer getCustomer() {
            return customer;
        }
        public void setCustomer(Customer customer) {
            this.customer = customer;
        }
        public double getAmount() {
            return amount;
        }
        public void setAmount(double amount) {
            this.amount = amount;
        }
        public int getCustomerID () {
            return customer.getId();
        }
        public String getCustomerName() {
            return customer.getName();
        }
        public double getAmountAfterDiscount() {
            return amount;
        }

        @Override
        public String toString() {
            return "Invoice [id=" + id + ", customer=" + customer + ", amount=" + amount + "]";
        }

    }
}
