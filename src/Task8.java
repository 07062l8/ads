import java.util.Scanner;

public class Task8 {
    /**
     * This method checks if a given string consists only of digits.
     * Time complexity: O(n), where n is the length of the string.
     * Linear Time complexity.
     * @param s The input string to check.
     * @return true if the string consists only of digits, false otherwise.
     */
    public static boolean isStringAllDigits(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a = sc.nextLine();

        double startTime = System.nanoTime();
        boolean allDigits = isStringAllDigits(a);
        double endTime = System.nanoTime();
        double duration = (endTime - startTime) / 1000000;

        System.out.println(allDigits ? "Yes" : "No");
        System.out.println("Time taken: " + duration + " milliseconds");

        sc.close();
    }
}
