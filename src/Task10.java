import java.util.Scanner;

public class Task10 {
    /**
     * This method calculates the Greatest Common Divisor (GCD) of two integers using recursion
     * based on the Euclidean Algorithm.
     * Time complexity: O(log(min(a, b))), logarithmic.
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();

        double startTime = System.nanoTime();
        int result = gcd(a, b);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }
}
