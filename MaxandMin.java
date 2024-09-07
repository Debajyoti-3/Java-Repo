package Array;

import java.util.Scanner;

public class MaxandMin {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();

            //int[] numbers = new int[]
            int array[] = new int[size];
            System.out.println("Pls Give the Numbers :");
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

        int max = array[0];
            for( int i=1;i<size;i++){
                if(max<array[i]){
                    max = array[i];
                }
            }
            int min = array[0];
            for( int i=1;i<size;i++){
                if(min>array[i]){
                    min = array[i];
                }
            }

            System.out.print("The max element is :");
            System.out.println(max);
            System.out.print("The min element is :");
            System.out.println(min);
        }
    }


