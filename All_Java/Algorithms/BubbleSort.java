package Algorithms;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the size :");
       int size=sc.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the Elements of the array :");
        for(int i=0; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Sorting :");
        for(int i=0; i<size ; i++){
            System.out.print(arr[i]+" ");
        }
        for(int i=0; i<size-1;i++){
            for(int j=0; j<size-1-i; j++){     // time Complexity: O(n^2)
                int flag=0;
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag=1;
                }
                if(flag==0){    // Optimized Bubble Sort: Using Flag Variable
                    break;
                }
            }
        }
        System.out.println();
        System.out.println("Array After Sorting :");
        for(int i=0; i<size ; i++){
            System.out.print(arr[i]+" ");
        }

    }
}
