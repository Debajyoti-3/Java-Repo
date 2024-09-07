package Array;

import java.util.Scanner;

public class LinearSearch {

        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of the array:");
            int size = sc.nextInt();

            //int[] numbers = new int[]
            int numbers[] = new int[size];
            System.out.println("Pls Give the Numbers :");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }
            System.out.println("enter the search element:");
            int X = sc.nextInt();

            int flag = 0;
            for (int i = 0; i < size; i++) {
                if(X == numbers[i]){
                    flag = 1;
                    System.out.println("Found in index "+i);
                    break;
                }

            }
            if(flag == 0){
                System.out.println("Not Found");
            }
        }
    }


