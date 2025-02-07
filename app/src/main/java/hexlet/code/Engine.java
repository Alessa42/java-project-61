package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Engine {
    public static void startGame(String gameDescription, String[][] questionsAndAnswers) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Запрашиваем имя пользователя
        System.out.print("Welcome to the Brain Games!");
                System.out.println("May I have your name?");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        int correctAnswers = 0;
        while (correctAnswers < 3) {
            int randomIndex = random.nextInt(questionsAndAnswers.length);
            String question = questionsAndAnswers[randomIndex][0];
            String correctAnswer = questionsAndAnswers[randomIndex][1];

            System.out.println(gameDescription);
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + name);
                return; // завершаем игру
            } else {
                System.out.println("Correct!");
                correctAnswers++;
            }
        }
        System.out.println("Congratulations, " + name);
    }
}


