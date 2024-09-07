package Algorithms;
import java.util.Arrays;  // It is part of Java Collection Framework

public class Sorting_NoAlgo {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        Arrays.sort(arr);  // No need to Write a Function foe Sorting

        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
