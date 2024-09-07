package OOPs;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Buffered_Reader {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the Number");

     InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);
        int num = Integer.parseInt(bf.readLine());
        System.out.println("Entered Number is : "+ num);
        bf.close();
    }
}
