import java.util.Date;

public class Transaction {
    private Date dateCreated;
    private char type;
    private double amount;
    private double balance;
    private String description;

    public Transaction(){};

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.dateCreated = new Date();
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public char getType() {
        return this.type;
    }

    public double getAmount() {
        return this.amount;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getDescription() {
        return this.description;
    }

}
