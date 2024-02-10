import java.util.Random;
import java.util.Scanner;

public class Guess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println(" Guess the Number Game!");

        boolean playAgain = true;
        int totalAttempts = 0;
        int roundsWon = 0;

        while (playAgain) {
            int randNumber = random.nextInt(100) + 1;
            int attempts = 0;

            while(true){
                System.out.print("give me your guess ( a number between 1 and 100): ");
                int Guess = scanner.nextInt();
                attempts++;
                if (Guess == randNumber) {
                    System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    roundsWon++;
                    break;
                } else if (Guess < randNumber) {
                    System.out.println("low number,give another.");
                } else {
                    System.out.println("high number,give another.");
                }
                if (attempts == 5) {
                    System.out.println("Sorry, you've reached the maximum number of attempts. The correct number was " + randNumber + ".");
                    break;
                }
            }
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = scanner.next().toLowerCase();
            playAgain = playAgainInput.equals("yes");
        }
        System.out.println("\nGame Over! Your total score: " + totalAttempts + " attempts, " + roundsWon + " rounds won.");
        scanner.close();
    }
}