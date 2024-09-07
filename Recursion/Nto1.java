package Recursion;
import java.util.Scanner;

public class Nto1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last number :");
        int x = sc.nextInt();
        numb(x);

    }
    public static int numb(int n){
        if( n==0){
            return 0;
        }
        System.out.println(n);
        return numb(n-1);
    }
}
