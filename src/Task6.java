import java.util.Scanner;

public class Task6 {
    /**
     * This method calculates the power of a number (a^n) using recursion.
     * Time complexity: O(n) due to the recursive calls.
     * @param a The base number.
     * @param n The exponent (non-negative integer).
     * @return The result of a raised to the power of n.
     */
    public static long powerRecursive(int a, int n) {
        if (n == 0) {
            return 1;
        } else {
            return a * powerRecursive(a, n - 1); // Recursive step
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int a = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();

        long result = powerRecursive(a, n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }
}
