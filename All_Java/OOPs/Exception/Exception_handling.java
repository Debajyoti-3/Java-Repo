package OOPs.Exception;

public class Exception_handling {
    public static void main(String[] args) {
        int i = 4;
        int j=0;
        try{                    // try block (checking)
            j = 17/i;
        }catch(Exception e){   // catch block (only for Exception)
            System.out.println("The Wrong Way");
        }
        System.out.println(j);
        System.out.println("Good Bye");
    }
}
