import java.util.Scanner;

public class FriendAnalysis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            age[i] = sc.nextInt();
            System.out.print("Enter height of " + friends[i] + ": ");
            height[i] = sc.nextDouble();
        }

        // Find youngest
        int minAgeIndex = 0;
        double maxHeight = height[0];
        int maxHeightIndex = 0;
        for (int i = 1; i < 3; i++) {
            if (age[i] < age[minAgeIndex]) minAgeIndex = i;
            if (height[i] > maxHeight) {
                maxHeight = height[i];
                maxHeightIndex = i;
            }
        }

        System.out.println("Youngest friend: " + friends[minAgeIndex]);
        System.out.println("Tallest friend: " + friends[maxHeightIndex]);
        sc.close();
    }
}