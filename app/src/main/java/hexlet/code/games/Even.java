package hexlet.code.games;
import java.util.Random;
import hexlet.code.Engine;

public class Even {
    public static void gameEven() {
        Random random = new Random();
        String[][] questionsAndAnswers = new String[3][2]; // 3 вопроса

        for (int i = 0; i < 3; i++) {
            int number = random.nextInt(100); // Генерируем случайное число
            questionsAndAnswers[i][0] = String.valueOf(number);
            questionsAndAnswers[i][1] = (number % 2 == 0) ? "yes" : "no"; // Проверяем четность
        }

        String gameDescription = "Answer 'yes' if the number is even, otherwise answer 'no'"; // Описание игры
        Engine.startGame(gameDescription, questionsAndAnswers);
    }
}