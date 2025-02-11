package hexlet.code.games;
import hexlet.code.Engine;
import java.util.Random;
public class PrimeNumber {
    public static void startGame() {
        var random = new Random();
        String[][] questionsAndAnswers = new String[Engine.NUMBER_OF_QUESTIONS][2];
        for (int i = 0; i < Engine.NUMBER_OF_QUESTIONS; i++) {
            int number = random.nextInt();
            boolean isPrime = isPrime(number);
            String correctAnswer = isPrime ? "yes" : "no";
            questionsAndAnswers[i][0] = Integer.toString(number);
            questionsAndAnswers[i][1] = correctAnswer;
        }
        String gameDescription = "Answer 'yes' if given number is prime. Otherwise answer 'no'";
        Engine.startGame(gameDescription, questionsAndAnswers);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Числа 0 и 1 не являются простыми
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // проверяем все числа, начиная с 2 и до квадратного корня из num
            if (num % i == 0) {
                return false; // Число делится на i без остатка, значит, оно не простое
            }
        }
        return true;
    }
}
