package Basic.BasicJava;
import java.util.*;

public class LC_9Pallindrome {

        public static boolean isPalindrome(int x) {
            int reverse =0;
            int temp=x;
            if(x<0){
                return false;
            }
            while(temp!=0){
                int remainder = temp % 10;
                reverse = 10 * reverse + remainder;
                temp = temp/10;
            }
            return reverse == x;

        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check : ");
        int a = sc.nextInt();
        System.out.println(isPalindrome(a));

    }
    }

