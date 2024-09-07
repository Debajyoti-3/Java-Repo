package OOPs.Exception;

public class Multiple_Catch {
    public static void main(String[] args) {
        int i = 4;
        int j=0;
        int[] arr = new int[6];
        try{                          // try block (checking)
            j = 17/i;
            System.out.println(arr[6]);
        }
        catch(ArithmeticException e){       // catch block (only for Exception)
            System.out.println("Can't divide by Zero");
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Check the limit");
        }
        catch(Exception e){                 // parent catch block (Always put parent block at down
            System.out.println("The Wrong Way");
        }
        System.out.println(j);
        System.out.println("Good Bye");
    }
}
