import java.util.Scanner;

public class HomeworkTemplate {
    public static void main(String[] args) {

        int correctCount = 0, wrongCount = 0;

        String[] questions = {"2+2?", "5^2?", "5-3?"};
        String[][] answerOptions = {{"1.3", "2.4", "3.8", "4.1"}, {"1.10", "2.15", "3.25", "4.30"},
                {"1.5", "2.10", "3.1", "4.2"}};
        String[] correctAnswers = {"2", "3", "4"};

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i] + "\n");
            for (String answer : answerOptions[i]) {
                System.out.println(answer);
            }
            System.out.print("\nВаш ответ: ");
            String userAnswer = scanner.next();

            if (correctAnswers[i].equalsIgnoreCase(userAnswer)) {
                correctCount++;
            } else {
                wrongCount++;

            }
        }

        System.out.println("Результат: правильно " + correctCount + ", неправильно " + wrongCount);
    }
}

