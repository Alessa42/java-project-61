package hexlet.code;
import java.util.Scanner;
public class Engine {
    public static final int NUMBER_OF_QUESTIONS = 3;
    public static void startGame(String gameDescription, String[][] questionsAndAnswers) {
        var scanner = new Scanner(System.in);
        // Запрашиваем имя пользователя
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        System.out.println(gameDescription);
        for (int i = 0; i < NUMBER_OF_QUESTIONS; i++) {
            String question = questionsAndAnswers[i][0];
            String correctAnswer = questionsAndAnswers[i][1];
            System.out.println("Question: " + question);
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again, " + name + "!");
                return; // завершаем игру
            } else {
                System.out.println("Correct!");
            }
        }
        System.out.println("Congratulations, " + name + "!");
        scanner.close();
    }
}
