package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void gameEven() {
        Scanner firstGame = new Scanner(System.in);
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name? ");
            String name = firstGame.nextLine();
            Random random = new Random();
            System.out.println("Hello, " + name + "!");
            System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
            int correctAnswers = 0;

            while (correctAnswers < 3) {
                int number = random.nextInt(100);
                System.out.println("Question: " + number);
                System.out.println("Your answer:");
                String correctAnswer = (number % 2 == 0) ? "yes" : "no";
                String userAnswer = firstGame.nextLine();

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
        }
    }


