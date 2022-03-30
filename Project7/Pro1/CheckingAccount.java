public class CheckingAccount extends Account{

    private double overdraft_limit;

    public CheckingAccount(int id, double balance, double overdraft_limit ){
        this.setId(id);
        this.setBalance(balance);
        this.overdraft_limit = overdraft_limit;
    }

    @Override
    public void withdraw(double amount) {

        if (this.getBalance() - amount >= -1 * this.overdraft_limit) {

            this.setBalance(this.getBalance() - amount);

        } else {

            System.out.println("Cannot withdraw from Account");

        }
    }
    
    public double getOverdraft_limit(){
        return overdraft_limit;
    }
}
