package Recursion;
import java.util.Scanner;


public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the position of fibo term:");
        int n = sc.nextInt();
       int x= fibo(n) ;
        System.out.println("The fibo number is "+x);
    }
    public static int fibo(int n){
        if(n==1){
            return 0;        // Base conditions
        }
        if(n==2){
            return 1;
        }

        return fibo(n-1)+fibo(n-2);

    }
}
