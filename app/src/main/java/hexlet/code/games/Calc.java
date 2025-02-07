package hexlet.code.games;
import hexlet.code.Engine;

import java.util.Random;
public class Calc {
    public static void calculate() {
        Random random = new Random();
        String[][] questionsAndAnswers = new String[3][2]; // 3 вопроса
        String operators = "+-*"; // Операторы

        for (int i = 0; i < 3; i++) {
            int a = random.nextInt(100);
            int b = random.nextInt(100);
            int randomOperator = random.nextInt(operators.length());
            char operator = operators.charAt(randomOperator);
            int correctAnswer = calculateAnswer(a, b, operator);

            questionsAndAnswers[i][0] = a + " " + operator + " " + b;
            questionsAndAnswers[i][1] = String.valueOf(correctAnswer);
        }
String gameDescription = "What is the result of the expression?";
        Engine.startGame(gameDescription, questionsAndAnswers);
    }

    private static int calculateAnswer(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}


