package Basic.BasicJava;
import java.util.Scanner;

public class Input2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
       int age = sc.nextInt();
        System.out.println("the given age is: "+ age);
        sc.close();
    }
}
/* NOTE:
        nextLine(): reads a line of text(string).
        nextInt(): reads an integer.
        nextDouble(): reads a double.
        nextBoolean(): reads a boolean.
        next(): reads a single word(String).
 */
