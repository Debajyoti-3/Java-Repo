package Basic.BasicJava;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// It is especially for reading lines of text. It is more efficient for large inputs

public class BufferedReaderEx {
    public static void main(String[] args) throws IOException{
        // create a BufferedReader object
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // Take input from the user
        System.out.println("Enter your name: ");
        String name = bf.readLine();

        System.out.println("Enter your age: ");
        int age = Integer.parseInt(bf.readLine());  // reads an integer

        System.out.println("Your age is "+age+" and your name is "+ name);
    }
}
