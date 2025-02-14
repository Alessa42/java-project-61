package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MIN_FIRST_TERM = 1;
    private static final int MIN_COMMON_DIFFERENCE = 1;
    private static final int MAX_COMMON_DIFFERENCE = 5;
    private static final int PROGRESSION_LENGTH_RANGE = 6;
    public static void startGame() {
        var random = new Random();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][2];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            // Генерируем случайные параметры для прогрессии
            int length = random.nextInt(PROGRESSION_LENGTH_RANGE) + MIN_LENGTH; // Длина от 5 до 10
            int firstTerm = random.nextInt(MAX_LENGTH) + MIN_FIRST_TERM; // Первое число от 1 до 10
            int commonDifference = random.nextInt(MAX_COMMON_DIFFERENCE) + MIN_COMMON_DIFFERENCE; // Разность от 1 до 5

            // Генерируем массив чисел прогрессии
            int[] progression = new int[length];
            for (int j = 0; j < length; j++) {
                progression[j] = firstTerm + j * commonDifference;
            }

            // Выбираем случайный индекс для скрытого значения
            int hiddenIndex = random.nextInt(length);
            int hiddenValue = progression[hiddenIndex];
            progression[hiddenIndex] = -1; // Используем -1 для обозначения пропущенного числа

            // Формируем строку с вопросом
            StringBuilder questionBuilder = new StringBuilder();
            for (int num : progression) {
                if (num == -1) {
                    questionBuilder.append(".. ");
                    //  добавляем строку с .., либо добавляете значение переменной num.
                } else {
                    questionBuilder.append(num).append(" ");
                }
            }

            // Заполняем массив вопросами и ответами
            questionsAndAnswers[i][0] = questionBuilder.toString();
            questionsAndAnswers[i][1] = Integer.toString(hiddenValue);
        }

        // Описание игры
        String gameDescription = "What number is missing in the progression?";
        // Запускаем игру
        Engine.startGame(gameDescription, questionsAndAnswers);
    }
}
