
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declaring the variable and assigning user input
        int number = scanner.nextInt();

        // Identifying the operation
        int square = number * number;

        System.out.println(square);
    }
}
