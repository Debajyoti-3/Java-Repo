package Functions;
import java.util.Scanner;

public class add2Numbers {
    public static int calculatesum(int x, int y){
        int sum = x + y;
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = calculatesum(a,b);
        System.out.println("Sum of two numbers is :"+sum);

    }
}
