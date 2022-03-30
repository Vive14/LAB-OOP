public class SavingAccount extends Account{
    
    public SavingAccount(int id, double balance){
        this.setId(id);
        this.setBalance(balance);
    }

    @Override
    public void withdraw(double amount) {
            
        if (this.getBalance() - amount >= 0) {
            this.setBalance(this.getBalance() - amount);

        } else {
            System.out.println("Cannot withdraw from Account");
        }
    }

}
