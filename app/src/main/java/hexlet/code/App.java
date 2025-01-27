package hexlet.code;

import java.util.Scanner;
import java.util.Random;

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
                System.out.println("Welcome to the Brain Games!");
                System.out.print("May I have your name? ");
                String name = scanner.nextLine();
                Random random = new Random();
                System.out.println("Hello, " + name + "!");
                System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
                int correctAnswers = 0;

                while (correctAnswers < 3) {
                    int number = random.nextInt(100);
                    System.out.println("Question: " + number);
                    System.out.println("Your answer:");
                    String correctAnswer = (number % 2 == 0) ? "yes" : "no";
                    String userAnswer = scanner.nextLine();

                    if (userAnswer.equals(correctAnswer)) {
                        System.out.println("Correct!");
                        correctAnswers++;
                    } else {
                        System.out.println("'" + userAnswer + "'" + " is a wrong answer ;(. Correct answer was '" + correctAnswer + "'.");
                        System.out.println("Let's try again, " + name + "!");
                        correctAnswers = 0;
                    }
                }
                System.out.println("Congratulations, " + name + "!");
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
}
