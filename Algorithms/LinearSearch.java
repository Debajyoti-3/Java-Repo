package Algorithms;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Size of the array:");
        int size= sc.nextInt();
        int[] array = new int[size];

        System.out.println("Enter the elements of the array:");
        for(int i=0;i<size;i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the search elemnet");
        int x = sc.nextInt();
        int flag=0;
        for(int i=0;i<size;i++){
            if(x==array[i]){
                System.out.println("FOUND");
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("NOT FOUND");
        }
    }
}
