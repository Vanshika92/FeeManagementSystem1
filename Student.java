public class Student {
    private int id;
    private String name;
    private double balance;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.balance = 0.0;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount + " into " + name + "'s account.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn $" + amount + " from " + name + "'s account.");
        }
    }
}
