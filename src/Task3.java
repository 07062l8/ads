import java.util.Scanner;

public class Task3 {
    /**
     * This method checks if a given number is prime.
     * Time complexity: O(sqrt(n)), where n is the input number.
     *
     * @param n The number to check for primality.
     * @return true if n is prime, false otherwise.
     */
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        double startTime = System.nanoTime();
        boolean isNumberPrime = isPrime(number);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println(isNumberPrime ? "Prime" : "Composite");
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
        }
}
