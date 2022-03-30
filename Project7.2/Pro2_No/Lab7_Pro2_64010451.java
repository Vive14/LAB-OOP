
public class Lab7_Pro2_64010451 {
    public static void main(String[] args) {
        NewAccount account = new NewAccount("George", 1122, 1000);

        account.setAnnualInterestRate(0.015);
        account.deposit(30);
        account.deposit(30);
        account.deposit(40);
        account.deposit(50);
        account.withdraw(5);
        account.withdraw(4);
        account.withdraw(2);

        System.out.println(account);
        System.out.println("Date\t\t\t\t\tType\t\t\t\tAmount\t\t\tBalance");

        for (Transaction transaction : account.getTransactions()) {

			System.out.printf("%s\t\t", transaction.getDateCreated());
			System.out.printf("%s\t\t\t\t", transaction.getType());
			System.out.printf("%.2f\t\t\t", transaction.getAmount());
			System.out.println(transaction.getBalance());
		}
        System.out.println("");
    }

}
