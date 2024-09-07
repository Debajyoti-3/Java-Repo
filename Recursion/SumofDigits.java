package Recursion;
import java.util.Scanner;


public class SumofDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int a = sc.nextInt();
       int ans= sum(a);
        System.out.println("It's sum of digits is :"+ans);
    }
    public static int sum(int a){
        if (a == 0) {

            return 0;
        }
        int r= a %10;


         return r+sum(a/10);
    }
}
