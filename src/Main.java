import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to my number guessing game");
        int randomNumber = (int) (Math.random() * 100) + 1;
        Scanner scanner = new Scanner(System.in);

        System.out.print("\nDo you want to play? (yes/no): ");
        String response = scanner.nextLine();

        int chances = 6;

        if(response.equalsIgnoreCase("YES")){
            System.out.println("Great! Let's play ");
            while(true){
                if (chances > 1) {
                    System.out.println("\nYou have " + chances + " chances left.");
                }else if(chances == 1){
                    System.out.println("\nYou have " + chances + " chance left.");
                }
                System.out.print("\nGuess a number between 1-100: ");

                int guess = scanner.nextInt();

                if (chances == 0){
                    System.out.println("Sorry, You're out of chances. Correct number was "+randomNumber);
                    System.out.println("Game Over!!!");
                    break;
                }

                if(guess == randomNumber){
                    System.out.println("You WON. Congratulations!");
                    break;
                } else if (guess > randomNumber) {
                    System.out.println("Oops! Wrong guess. Go below "+guess);
                    chances --;
                } else{
                    System.out.println("Oops! Wrong guess. Go above "+ guess);
                    chances --;
                }
            }
        } else if (response.equalsIgnoreCase("NO")) {
            System.out.println("Goodbye...");
        }else{
            System.out.println("Invalid answer");
        }

    }
}