package Level_1;
import java.util.Scanner;
public class MultiplicationTable6To9 {
    public static void main(String[]in){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int [] multiplication  = new int[4];
        for(int i = 6; i<=9; i++){
            multiplication[i-6] = number * i;
        }
        for (int i =6; i<=9; i++){
            System.out.println(number + " * " + i + " = " + multiplication[i-6]);
        }
        scanner.close();
    }
}
