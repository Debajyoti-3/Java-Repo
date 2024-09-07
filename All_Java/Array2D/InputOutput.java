package Array2D;
import java.util.Scanner;

public class InputOutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Value of Row :");
        int row = sc.nextInt();
        System.out.println("value of coloumn :");
        int col = sc.nextInt();
        int arr[][] = new int[row][col];


        System.out.println("Give the array elements :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(" The array elements are :");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
