package Array;
import java.util.Scanner;

public class Input_Output {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int size = sc.nextInt();    // use as scanf in C Language

        //int numbers[] = new int[]
        int[] numbers = new int[size];
        System.out.println("Pls Give the Numbers :");
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        System.out.println("The Given numbers are :");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i]+" ");
        }
    }
}
