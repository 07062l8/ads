import java.util.Scanner;

public class Task7 {
    /**
     * This method reads an array of integers from the user and prints them in reverse order using recursion without explicitly storing the array.
     * Time complexity: O(n), where n is the number of elements.
     * Linear time complexity.
     * @param n The number of elements to read and print.
     */
    public static void reversePrint(int n) {
        if (n <= 0) {
            return;
        }
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        reversePrint(n - 1);
        System.out.print(num + " ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements (n): ");
        int n = sc.nextInt();

        double startTime = System.nanoTime();
        System.out.println("Enter the array elements one by one:");
        reversePrint(n);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("\nTime taken: " + duration + " milliseconds");
        sc.close();

    }
}
