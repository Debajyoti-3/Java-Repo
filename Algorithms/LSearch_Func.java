package Algorithms;

import java.util.Scanner;

public class LSearch_Func {
    public static int Ls(int[] arr, int target) {

     if(arr.length==0){
         return -1;
     }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                System.out.println("FOUND");
                return i;
            }

        }
        return -1;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int[] array = {1, 4, 5, 6, 7};
        int ans = Ls(array, 2);
        System.out.println("at index :"+ans);
    }
}








