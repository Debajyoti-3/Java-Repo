package OOPs.Exception;

class RickException extends Exception {   // Custom exception class
    public RickException(String str){
     super(str);
    }
}

public class Custom_Exception {


    public static void main(String[] args) {
        int i = 33;
        int j=0;
        try{                            // try block (checking)
            j = 17/i;
            if(j == 0) {
                throw new RickException("I don't want to Print Zero");
            }
        }
        catch(RickException e){
            j = 18/1 ;                              // catch block (only for Exception)
            System.out.println("That is Default"+ e);
        }
        catch(Exception e){                         // parent catch block
            System.out.println("The Wrong Way");
        }
        System.out.println(j);
        System.out.println("Signning Off !");
    }
}
