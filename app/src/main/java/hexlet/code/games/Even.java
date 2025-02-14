package hexlet.code.games;

import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void startGame() {
        var random = new Random();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][2];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int number = random.nextInt(100);
            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = (number % 2 == 0) ? "yes" : "no";
        }
        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'";
        Engine.startGame(gameDescription, questionsAndAnswers);
    }
}
