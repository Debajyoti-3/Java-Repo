package Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
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
        selection(arr);
        System.out.println();
        System.out.println("Array after Sorting :");
        for(int i=0; i<size ; i++){
            System.out.print(arr[i]+" ");

        }
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
        public static void selection(int[] arr){
            for(int i=0;i<arr.length -1; i++){      // N times Swapping and in another times Shiftting
                int min=i;


                for(int j=i+1;j<arr.length;j++){
                    if(arr[min]>arr[j]){
                        min=j;


                    }
                }
                int temp= arr[min];
                arr[min]=arr[i];
                arr[i]=temp;
            }
        }

    }

