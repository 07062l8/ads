import java.util.Scanner;

public class Task5 {
    /** This method calculates the n-th element of the Fibonacci sequence using recursion.
     * Time complexity: O(2^n)
     * Exponential time complexity.
     * @param n The index of the desired Fibonacci number (n >= 0).
     * @return The n-th Fibonacci number.
     */
    public static int fib(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n-th Fibonacci number: ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        int result = fib(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("The " + n + "-th Fibonacci number: " + result);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }
}
