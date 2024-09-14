package Basic.BasicJava;
import java.util.*;

public class input {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Numb :");
        int a = sc.nextInt();
        //System.out.println("Enter the 2nd Numb :");
        // int b = sc.nextInt();

        System.out.println("Enter a string");
        sc.nextLine();
        String s = sc.nextLine();   // nextInt() and nextLine() can't go right after
        sc.close();

        //int c = a + b;
        System.out.println("The number is "+a);
        System.out.println("String is: "+s);
    }
}
