import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Welcome to Number Guessing Game.");
        System.out.println("You have 5 attempts.");
        do{
            int targetNumber = rand.nextInt(100)+1;
            int attempts=0;
            int remainingAttempts=0;
            System.out.println("Guess a Number between 1 to 100");
            while(attempts<5){
                int userGuess=sc.nextInt();
                attempts++;
                remainingAttempts=5-attempts;
                if(userGuess==targetNumber){
                    System.out.println("Congratulations you wonn!!!");
                    break;
                }else if(userGuess<targetNumber){

                    System.out.println("Guesses Too low!! Try Again \nRemaining Attempts: "+ remainingAttempts);
                } else if (userGuess>targetNumber) {
                    System.out.println("Guess Too High!! Try Again \nRemaining Attempts: "+ remainingAttempts);
                }

                if(attempts==5){
                    System.out.println("You have no attempts more. Target Number was= "+targetNumber);
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String round=sc.next().toLowerCase();
            if(round.equals("no")){
                break;
            }

        }while(true);




    }
}