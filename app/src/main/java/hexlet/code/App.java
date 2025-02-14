package hexlet.code;
import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.Gcd;
import hexlet.code.games.PrimeNumber;
import hexlet.code.games.Progression;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner game = new Scanner(System.in);
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("0 - Exit");
        System.out.println("1 - Greet");
        System.out.println("2 - Game Even-Odd");
        System.out.println("3 - Game Calculate");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.print("Your choice: ");
        String input = game.nextLine();
        switch (input) {
            case "0":
                System.out.println("Exiting...");
                break;
            case "1":
                Cli.run();
                break;
            case "2":
                Even.startGame();
                break;
            case "3":
                Calc.startGame();
                break;
            case "4":
                Gcd.startGame();
                break;
            case "5":
                Progression.startGame();
                break;
            case "6":
                PrimeNumber.startGame();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
        game.close();
    }
}
