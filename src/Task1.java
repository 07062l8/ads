import java.util.Scanner;

public class Task1 {
    /**
     * This method finds the minimum element in an array of integers.
     * Time complexity: 0(n), where n is the input number.
     * Linear time complexity.
     * @param arr Array of integers.
     * @return Minimum element in an array.
     */
    public static int findMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
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
        int min = findMinimum(arr);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;
        System.out.println("Minimum is: " + min);
        System.out.println("Time taken: " + duration + " milliseconds");


    }
}