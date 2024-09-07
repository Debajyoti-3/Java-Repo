package Array2D;

import java.util.Scanner;

public class Transpose {
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
            System.out.println(" The Matrix is :");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
            for(int i=0;i<row;i++){
                for(int j=i;j<col;j++){
                    int temp=arr[i][j];
                    arr[i][j]=arr[j][i];
                    arr[j][i]=temp;
                }
            }
            System.out.println(" The Transpose Matrix is :");
            for(int i=0;i<row;i++){
                for(int j=0;j<col;j++){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }

        }
    }


