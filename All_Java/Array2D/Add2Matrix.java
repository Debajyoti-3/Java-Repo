package Array2D;

import java.util.Scanner;

public class Add2Matrix {

        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);
            System.out.println("Value of 1st Row :");
            int row1 = sc.nextInt();
            System.out.println("value of 1st coloumn :");
            int col1 = sc.nextInt();
            int arr[][] = new int[row1][col1];


            System.out.println("Give the 1st matrix elements :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr[i][j] = sc.nextInt();
                }
            }

            System.out.println("Value of 2nd Row :");
            int row2 = sc.nextInt();
            System.out.println("value of 2 coloumn :");
            int col2 = sc.nextInt();
            int brr[][] = new int[row1][col1];


            System.out.println("Give the 1st matrix elements :");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    brr[i][j] = sc.nextInt();
                }
            }
            System.out.println(" The 1st Matrix is:");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

            System.out.println(" The 2nd Matrix is:");
            for(int i=0;i<row2;i++){
                for(int j=0;j<col2;j++){
                    System.out.print(brr[i][j]+" ");
                }
                System.out.println();
            }
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    arr[i][j]=arr[i][j]+brr[i][j];
                }
            }
            System.out.println("Matrix after Addition :");
            for(int i=0;i<row1;i++){
                for(int j=0;j<col1;j++){
                    System.out.print(arr[i][j]+"  ");
                }
                System.out.println();
            }
        }
    }


