import java.util.Scanner;

public class Task4 {
    /**
     * This method calculates the factorial of a given number.
     * It uses a recursive approach.
     * Time complexity: 0(n), where n is the input number.
     * Linear time complexity.
     *
     * @param n The number for which the factorial is to be calculated.
     * @return The factorial of the given number.
     */
    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        };
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        double startTime = System.nanoTime();
        int result = factorial(number);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Factorial of " + number + " is: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");
    }
}
