package OOPs;
import java.util.Scanner;
import java.io.IOException;
  // import java.io.BufferedReader;
// import java.io.InputStreamReader;

public class Scanner_Class {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the Number");

        //        InputStreamReader in = new InputStreamReader(System.in);
       //        BufferedReader bf = new BufferedReader(in);
      //        int num = Integer.parseInt(bf.readLine());

        Scanner sc = new Scanner(System.in); // introduced in Java 1.5
       int num= sc.nextInt();

        System.out.println("Entered Number is : "+ num);
       // bf.close();
    }
}
