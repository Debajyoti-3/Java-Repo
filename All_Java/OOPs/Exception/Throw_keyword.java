package OOPs.Exception;

public class Throw_keyword {

    public static void main(String[] args) {
        int i = 20;
        int j=0;
        try{                            // try block (checking)
            j = 17/i;
            if(j == 0) {
                throw new ArithmeticException("I don't want to Print Zero");   // throw keyword and creating a new object of Arithmetic Exception
            }                           // throw keyword to throw the exception and catch block to catch the exception
        }
        catch(ArithmeticException e){
            j = 18/1 ;                              // catch block (only for Exception)
            System.out.println("That is Default "+ e);
        }
        catch(Exception e){                         // parent catch block
            System.out.println("The Wrong Way");
        }
        System.out.println(j);
        System.out.println("Signning Off !");
    }
}
