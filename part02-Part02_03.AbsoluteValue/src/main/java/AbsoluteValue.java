
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = scanner.nextInt();

        if (inputNumber < 0) {
            inputNumber = inputNumber * (-1);
        }

        System.out.println(inputNumber);
    }
}
