package Recursion;
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numb of factorial :");
        int a = sc.nextInt();
        System.out.println("The value of factorial is :"+ Fact(a));

    }
    public static int Fact(int n){
        if (n<0){
            return -1;
        }
        if(n==1 || n==0){
            return 1;
        }
        return n * Fact(n-1);
    }
}
