package OOPs.Casting;

class A{
    public  void mod1(){
        System.out.println("Happy Birthday ");
    }
}
class B extends A{
    public void mod2(){
        System.out.println("Good Evening...");
    }
}

public class Upcasting_Downcasting {
    public static void main(String[] args) {
       A obj = (A)new B();                       // Upcasting : going down to up
       obj.mod1();

       A obj1 = (B) obj;                        // Downcasting : going up to down
       obj1.mod1();
    }
}
