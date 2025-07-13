import java.util.Scanner;

public class TestScores {
    public static void main(String[] args) {
        int[] scores = {85, 92, 78, 96, 88};

        int maxScore = scores[0], sum = 0;
        for (int score : scores) {
            if (score > maxScore) {
                maxScore = score;
            }
            sum += score;
        }


        double average = (double) sum / scores.length;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a value to search :");
        int searchValue = scanner.nextInt();
        int index = -1;
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] == searchValue) {
                index = i;
                break;
            }
        }

        System.out.println("Maximum score: " + maxScore);
        System.out.println("Sum of scores: " + sum);
        System.out.println("Average score: " + average);

        if (index != -1) {
            System.out.println("Score " + searchValue + " found at index " + index);
        } else {
            System.out.println("Score " + searchValue + " not found in the array.");
        }
    }
}
