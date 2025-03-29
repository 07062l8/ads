import java.util.Scanner;

public class Task9 {
    /**
     * This method calculates the binomial coefficient C(n, k) using recursion
     * based on the formula C(n, k) = C(n-1, k-1) + C(n-1, k).
     * Time complexity:0(2^n), exponential.
     * @param n The total number of items.
     * @param k The number of items to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomial(int n, int k) {
        if (k == 0 || k == n) {
            return 1;
        } else if (k == 1 || k == n - 1) {
            return n;
        } else {
            return binomial(n - 1, k - 1) + binomial(n - 1, k);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of k: ");
        int k = sc.nextInt();

        double startTime = System.nanoTime();
        int result = binomial(n, k);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println(result);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }
}
