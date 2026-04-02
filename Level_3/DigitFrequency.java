import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        long number = sc.nextLong();  // Using long to handle big numbers

        // Convert number to string to easily iterate digits
        String numStr = Long.toString(Math.abs(number)); // abs() to handle negative numbers

        int[] freq = new int[10]; // Frequency array for digits 0-9

        // Count frequency of each digit
        for (int i = 0; i < numStr.length(); i++) {
            char ch = numStr.charAt(i);
            int digit = ch - '0';  // Convert char to int
            freq[digit]++;
        }

        // Display frequency of digits
        System.out.println("Digit frequencies:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + " occurs " + freq[i] + " time(s)");
            }
        }

        sc.close();
    }
}