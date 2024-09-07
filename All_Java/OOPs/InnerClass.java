package OOPs;

class A{
    public void good(){
        System.out.println("Good to go...");
    }
    class B{                      // Inner Class
        public void done(){
            System.out.println("Doing...");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.good();

        A.B obj1 = obj.new B();   // A.B means B class belongs to A class
        obj1.done();
    }
}
