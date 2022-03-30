import java.util.Scanner;

public class Lab5_Pro1_64010451 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setId(1122);
        a1.setBalance(20000);
        a1.setAnnualInterestRate(4.5);
        
        // amount money
        System.out.print("withdraw(1) or deposit(2) :  ");
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("How much do you want to withdraw?: ");
            double amount = input.nextDouble();
            a1.withdraw(amount);
        }
        else if (choice == 2) {
            System.out.print("How much do you want to deposite?: ");
            double amount = input.nextDouble();
            a1.withdraw(amount);
        }
        else{
            System.out.println("input withdraw(1) or deposit(2) : ");
            return;
        }

        //display 
        System.out.println("Balance: " + a1.getBalance());
        System.out.println("Monthly Interest: " + a1.getMonthlyInterest());
        System.out.println("Date when this account was created: " + a1.getDateCreated());

    }
}
