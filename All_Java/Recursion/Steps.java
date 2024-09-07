package Recursion;
import java.util.Scanner;

public class Steps {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        System.out.println("Required Steps is :"+NoofSteps(n));
    }
    public static int NoofSteps(int n){
        return helper(n,0);

    }
    public static int helper(int n,int steps) {
        if(n==0){
            return steps;
        }
        if(n%2 ==0){
            return helper(n/2,steps+1);
        }
        return helper(n-1,steps+1);
    }
}
