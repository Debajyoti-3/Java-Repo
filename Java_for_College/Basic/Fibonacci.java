package Java_for_College.Basic;

public class Fibonacci {
    public static void main(String[] args) {

        int a = 0;
        int b = 1;
        System.out.print(a+" "+b+" ");
        int terms = 10;
        for (int i = 1; i < terms - 1; i++) {
            int c = a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }
    }
}
