import java.util.Scanner;

public class Task2 {
    /**
     * This method calculates the average of elements in an array of integers.
     * Time complexity: O(n), where n is the number of elements in the array.
     * Linear time complexity.
     * @param arr Array of integers.
     * @return The average of elements in the array.
     */
    public static double findAverage(int[] arr) {
        double sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum / arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array:");
        int n = sc.nextInt();
        sc.nextLine();
        int[] arr = new int[n];
        String inputLine = sc.nextLine();
        String[] numberStrings = inputLine.split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(numberStrings[i]);
        }

        double startTime = System.nanoTime();
        double average = findAverage(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Average is: " + average);
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }
}
