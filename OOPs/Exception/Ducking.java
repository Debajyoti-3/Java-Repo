package OOPs.Exception;
class A{
    public void show() throws ClassNotFoundException
    {
        Class.forName("Calc");  // There is no Calc class
       // Class.forName("OOPs.Exception.A"); You have to name the Class in proper root way

    }
}

public class Ducking{
    static{
        System.out.println("Class Loaded");
    }
    public static void main(String[] args) // throws ClassNotFoundException
                                           // never do throws to main, as it throws exception to JVM
                                            // and that wil not fair
    {
        A obj = new A();
        try{
        obj.show();
        } catch(ClassNotFoundException e){
            System.out.println("Bye");
              e.printStackTrace();  // printing funtion call in stack format
        }
    }
}
