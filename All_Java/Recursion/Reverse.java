package Recursion;
import java.util.Scanner;


public class Reverse {
    static int sum =0;
    public static void rev1(int n){
      if(n==0){
          return;
      }
      int r = n%10;
      sum= sum*10+r;
      rev1(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        rev1(n);
        System.out.println("the Reverse is :"+sum);

    }
}
