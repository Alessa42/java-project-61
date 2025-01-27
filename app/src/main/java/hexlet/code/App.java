package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the game number and press Enter.");
            System.out.println("1 - Greet");
            System.out.println("0 - Exit");
            System.out.print("Your choice: ");

            String input = scanner.nextLine();

            if (input.equals("0")) {
                System.out.println("Exiting...");
                break;
            } else if (input.equals("1")) {
                Even.gameEven();
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
