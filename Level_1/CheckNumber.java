package Level_1;
import java.util.Scanner;
public class CheckNumber{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers: ");
        for(int i = 0; i< numbers.length;i++){
            System.out.print("Number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] > 0){
                System.out.println("The number " + numbers[i] + " is Positive.");
                if(numbers[i] % 2 == 0){
                    System.out.println("The number " + numbers[i] + " is Even.");
                } else {
                    System.out.println("The number " + numbers[i] + " is Odd.");
                }
            }else if(numbers[i] < 0) {
                System.out.println("The number " + numbers[i] + " is Negative.");
            }else if(numbers[i] == 0) {
                System.out.println("The number " + numbers[i] + " is Zero.");
            }
        }
        int first = numbers[0];
        int last = numbers[numbers.length - 1];
        if (first == last) {
            System.out.println("First and last elements are equal.");
        } else if (first > last) {
            System.out.println("First element is greater than last element.");
        } else {
            System.out.println("First element is less than last element.");
        }
        scanner.close();
    }
}
