package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public class Progression {
    public static void startGame() {
        var random = new Random();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][2];

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            // Генерируем случайные параметры для прогрессии
            int length = random.nextInt(6) + 5; // Длина от 5 до 10
            int firstTerm = random.nextInt(10) + 1; // Первое число от 1 до 10
            int commonDifference = random.nextInt(5) + 1; // Разность от 1 до 5

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
