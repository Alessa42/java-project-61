package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
public class Calc {
    public static void startGame() {
        var random = new Random();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][2]; // 3 вопроса
        String[] operators = {"+", "-", "*"}; // Операторы

        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int randomOperatorIndex = random.nextInt(operators.length);
            String operator = operators[randomOperatorIndex];
            int correctAnswer = calculateAnswer(a, b, operator);
            questionsAndAnswers[i][0] = a + " " + operator + " " + b;
            questionsAndAnswers[i][1] = Integer.toString(correctAnswer);
        }
        String gameDescription = "What is the result of the expression?";
        Engine.startGame(gameDescription, questionsAndAnswers);
    }
    private static int calculateAnswer(int a, int b, String operator) {
        return switch (operator) {
            case "+" -> a + b;
            case "-" -> a - b;
            case "*" -> a * b;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}
