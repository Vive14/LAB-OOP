import java.util.Date;

public class Account {
    private int id;    //1
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getid() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getbalance() {
        return this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getannualInterestRate() {
        return this.annualInterestRate;
    }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public void withdraw (double amount) {
       if (amount > this.balance || amount < 0 ) {
           System.out.println("Enter the correct value or not enough money in the account : ");
       } 
       else {
        this.balance -= amount;
       }
    }

    public void deposit(double amount) {
        if (amount < 0 ) {
            System.out.println("Enter the correct value: ");
        } 
        this.balance += amount;
    }

}
