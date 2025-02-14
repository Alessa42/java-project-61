package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Gcd {
    private static final int MAX_VALUE = 100;
    public static void startGame() {
        var random = new Random();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][2]; // 3 вопроса

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int a = random.nextInt(MAX_VALUE);
            int b = random.nextInt(MAX_VALUE);
            int correctAnswer = getNod(a, b);
            questionsAndAnswers[i][0] = a + " " + b;
            questionsAndAnswers[i][1] = Integer.toString(correctAnswer);
        }
        String gameDescription = "Find the greatest common divisor of given numbers.";
        Engine.startGame(gameDescription, questionsAndAnswers);
    }
    private static int getNod(int a, int b) {
        return (b == 0) ? a : getNod(b, a % b);
    }
}
