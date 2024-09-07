package Array;

import java.util.Scanner;

public class ReveseArray {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();

            //int[] numbers = new int[]
            int Array[] = new int[size];
            System.out.println("Pls Give the Numbers :");
            for (int i = 0; i < size; i++) {
                Array[i] = sc.nextInt();
            }
            System.out.print("The Given Array is :");
            for (int i = 0; i < size; i++) {
                System.out.print(Array[i]+" ");
            }
            System.out.println();
            int i=0,j=size-1;
            while(i<=j){
              int temp=Array[i];
              Array[i]=Array[j];
              Array[j]=temp;
              i++;
              j--;

            }
            System.out.print("The Reverse Array is :");
            for (int k= 0; k < size; k++) {
                System.out.print(Array[k]+" ");
            }

        }
    }


