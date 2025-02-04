package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Gcd {
    public static void nodGame () {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name);
        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            System.out.println("Find the greatest common divisor of given numbers");
            System.out.println("Question:" + a + " " + b);
            System.out.println("Your answer: ");
            int userAnswer = scanner.nextInt();
            int correctAnswer = getNod(a, b);
            if (userAnswer != correctAnswer) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again," + name);
                correctAnswers = 0;
            } else {
                System.out.println("Correct!");
                correctAnswers++;
            }
        }
            System.out.println("Congratulations, " + name);
    }
    private static int getNod(int a, int b) {
        if (b == 0) {
            return a;
        }
        return getNod(b, a % b);
    }
}
