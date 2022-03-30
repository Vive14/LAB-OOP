import java.util.Date;

public class Account {
    private int id;    
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;

    public Account() {
        this.id = 0;
        this.balance = 0;
        this.annualInterestRate = 0;
        this.dateCreated = new Date();
    }
    public Account(int id, double balance){
        this.id= id;
        this.balance = balance;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getAnnualInterestRate() {
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

    public String toString() {
		return "This account was created at " + getDateCreated();
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
