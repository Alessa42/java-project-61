package hexlet.code;
import java.util.Random;
import java.util.Scanner;

public class Calc {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Запрашиваем имя пользователя
        System.out.print("May I have your name? ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
        boolean hasPlus = false;
        boolean hasMinus = false;
        boolean hasMultiply = false;

        // Запускаем игру
        while (!hasPlus || !hasMinus || !hasMultiply) {
            // Генерируем случайные числа и операцию
            int a = random.nextInt(100); // первое число от 0 до 99
            int b = random.nextInt(100); // второе число от 0 до 99
            char operator = getRandomOperator(random);
            if (operator == '+') {
                hasPlus = true;
            } else if (operator == '-') {
                hasMinus = true;
            } else if (operator == '*') {
                hasMultiply = true;
            }

            // Вычисляем правильный ответ
            int correctAnswer = calculateAnswer(a, b, operator);

            // Вопрос
            System.out.println("What is the result of the expression?");
            System.out.println("Question: " + a + ' ' + operator + ' ' + b);
            System.out.println("Your answer: ");
            int userAnswer = scanner.nextInt();

            // Проверяем правильность ответа
            if (userAnswer != correctAnswer) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer);
                System.out.println("Let's try again," + name);
                return; // Завершаем игру при неверном ответе
            } else {
                System.out.println("Correct!");
            }
            // Поздравляем пользователя с успешным завершением игры
            System.out.println("Congratulations, " + name);
        }
    }

    // Метод для получения случайного оператора
    private static char getRandomOperator(Random random) {
        char[] operators = {'+', '-', '*'};
        int index = random.nextInt(operators.length);
        return operators[index];
    }

    // Метод для вычисления правильного ответа в зависимости от оператора
    private static int calculateAnswer(int a, int b, char operator) {
        return switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new IllegalArgumentException("Invalid operator: " + operator);
        };
    }
}

