package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size :");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the Elements of the array :");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array before Sorting :");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        Insertion(arr);
        System.out.println();
        System.out.println("Array after Sorting :");
        System.out.println(Arrays.toString(arr));

    }

    public static void Insertion(int[] arr) {


        for (int i = 1; i < arr.length; i++) {
            int j = i - 1;
            int temp = arr[i];
            while (j >= 0 && arr[j] > temp) {     // No SWAP in Insertion only SHIFT
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }
}
