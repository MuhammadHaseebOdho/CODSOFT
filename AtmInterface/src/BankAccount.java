public class BankAccount {
    private double balance;

    public double getBalance() {
        return balance;
    }
    public void deposit(double amount){
        this.balance+=amount;
    }

    public boolean withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
            return true;
        }else {
            return false;
        }
    }
}
