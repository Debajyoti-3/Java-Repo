package Functions;
import java.util.Scanner;

public class Product2Numbers {
    public static int product(int x,int y){
    int prod = x*y;
    return prod;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("The 1st no is :");
        int a = sc.nextInt();
        System.out.println("The 2nd no is :");
        int b = sc.nextInt();
        int prod = product(a,b);
        System.out.println("The Product of two numbers is :"+ prod);


    }
}
