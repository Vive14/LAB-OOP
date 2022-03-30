import java.util.Scanner;

public class Lab7_Pro1_64010451{
    public Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        
        Account account = new Account(1, 5000);
        account.withdraw(10000);
        System.out.println("Checking Account");
        System.out.println("Balance is " + account.getBalance()) ;
	    System.out.println("Withdraw is 10000");
	    System.out.printf("Balance is %.2f\n", account.getBalance());
	    System.out.println(account);
        System.out.print("\n");

        CheckingAccount checkingAccount = new CheckingAccount(2, 5000, 5000);
        checkingAccount.withdraw(10000);
        System.out.println("Checking Account");
        System.out.printf("Overdraft Limit: %.2f\n", checkingAccount.getOverdraft_limit());
        System.out.println("Balance is " + checkingAccount.getBalance()) ;
	    System.out.println("Withdraw is 10000");
	    System.out.printf("Balance is %.2f\n", checkingAccount.getBalance());
	    System.out.println(checkingAccount);
        System.out.print("\n");
         
		SavingAccount savingsAccount = new SavingAccount(3, 5000);
		savingsAccount.withdraw(10000);
		System.out.println("Checking Account");
		System.out.printf("Balance is %.2f\n", savingsAccount.getBalance());
		System.out.println("Withdraw: 10000.00");
		System.out.printf("Balance is %.2f\n", savingsAccount.getBalance());
		System.out.println(savingsAccount);
        System.out.print("\n");

    }
}