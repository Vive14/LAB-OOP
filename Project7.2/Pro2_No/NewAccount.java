import java.util.ArrayList;
import java.util.Date;

public class NewAccount {
   private String name;
   private int id;
   private double balance;
   private double annualInterestRate;
   private Date dateCreated;
   private ArrayList<Transaction> transactions = new ArrayList<>();

   public NewAccount(){}

   public NewAccount(String name, int id, double balance){
       this.name = name;
       this.id = id;
       this.balance = balance;
   }

   public NewAccount(int id, double balance){
       this.id = id;
       this.balance = balance;
       this.dateCreated = new Date();
   }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    public double getMonthlyInterestRate() {
        return (this.annualInterestRate / 100) / 12;
    }

    public double getMonthlyInterest() {
        return this.balance * this.getMonthlyInterestRate();
    }
    
    public void withdraw (double amount) {
        if (amount > this.balance || amount < 0 ) {
            System.out.println("Enter the correct value or not enough money in the account : ");
        } 
        else {
         this.balance -= amount;
         transactions.add(new Transaction('W', amount, this.balance, "NULL"));
        }
     }
 
    public void deposit(double amount) {
         if (amount < 0 ) {
             System.out.println("Enter the correct value: ");
         } 
         this.balance += amount;
         transactions.add(new Transaction('D', amount, this.balance, "NULL"));
     }

    public ArrayList<Transaction> getTransactions() {
        return this.transactions;
    }

    public String toString() {
        return "\nName : " + this.name + "\nAccount ID : " + this.id + "\nAnnual interest rate : " + this.annualInterestRate + 
        "\nBalance : " + this.balance;
    }


}
