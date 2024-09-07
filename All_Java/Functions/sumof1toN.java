package Functions;
import java.util.Scanner;


public class sumof1toN {
    public static int sumofN(int x){  // x is formal parameter

        int sum = 0;
        for(int i=1; i<=x;i++){
            sum = sum+i;
        }
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the last number :");
        int n = sc.nextInt();      // n is actual parameter
        int sum = sumofN(n);
        System.out.println("The value of sum is :"+sum);
    }
}
