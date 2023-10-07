public class Main {

    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount();
        AtmMachine atmMachine=new AtmMachine(bankAccount);
        atmMachine.run();
    }
}