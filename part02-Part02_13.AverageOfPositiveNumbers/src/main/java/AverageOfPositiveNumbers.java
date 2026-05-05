
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int positiveCount = 0;
        double positiveSum = 0;
        double positiveAvg = 0;

        while(true) {
            int number = scanner.nextInt();

            if (number == 0) {
                break;
            }

            if (number > 0) {
                positiveCount++;
                positiveSum += number;
            }
        }

        if (positiveCount > 0) {
            positiveAvg = positiveSum / positiveCount;
            System.out.println(positiveAvg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
