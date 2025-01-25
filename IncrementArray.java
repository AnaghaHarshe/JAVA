import java.util.Arrays;

public class IncrementArray {

    public static int[] plusOne(int[] digits) {
        int n = digits.length;

        // Iterate from right to left
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // No carry-over, we can return
            } else {
                digits[i] = 0; // Carry-over, set current digit to 0
            }
        }

        // If we reach here, it means all digits were 9, so we need to add a new digit
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1; // The new leading digit is 1
        return newDigits;
    }

    public static void main(String[] args) {
        int[] digits1 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(digits1))); // Output: [1, 2, 4]

        int[] digits2 = {1, 2, 9};
        System.out.println(Arrays.toString(plusOne(digits2))); // Output: [1, 3, 0]

        int[] digits3 = {9, 9, 9};
        System.out.println(Arrays.toString(plusOne(digits3))); // Output: [1, 0, 0, 0]

        int[] digits4 = {9};
        System.out.println(Arrays.toString(plusOne(digits4))); // Output: [1, 0]

        int[] digits5 = {0};
        System.out.println(Arrays.toString(plusOne(digits5))); // Output: [1]
    }
}
