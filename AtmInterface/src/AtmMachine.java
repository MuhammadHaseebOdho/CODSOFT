import java.util.Scanner;

public class AtmMachine {
    private BankAccount bankAccount;

    public AtmMachine(BankAccount bankAccount){
        this.bankAccount=bankAccount;
    }

    public void displayOptions() {
        System.out.println("Welcome To ATM");
        System.out.println("1.Withdraw");
        System.out.println("2.Deposit");
        System.out.println("3.Check Balance");
        System.out.println("4.Exit");
    }

    public void run() {

        Scanner scanner = new Scanner(System.in);
        boolean isRunning = true;

        while (isRunning) {
            displayOptions();
            System.out.print("Enter your choice (1/2/3/4): ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw: ");
                    double withdrawAmount = scanner.nextDouble();
                    if (bankAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful!");
                    } else {
                        System.out.println("Insufficient funds for withdrawal.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: ");
                    double depositAmount = scanner.nextDouble();
                    bankAccount.deposit(depositAmount);
                    System.out.println("Deposit successful!");
                    break;
                case 3:
                    double balance = bankAccount.getBalance();
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    isRunning = false;
                    System.out.println("Thank you for using the ATM!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

}
