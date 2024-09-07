package OOPs.Interface;

// class -> class : extends
// class -> interface : implements
// interface -> interface : extends

interface A{     // interface is not a class

    int age = 23;                    // in interface variables are Static and final
    String city = "Kolkata";
    void show();                        //in interface is already public abstract
    void config();
}

interface X{
    void run();
}
                                  // using implement keyword
class B implements A,X{           // here we can implement more than 1 interfaces
    public void show(){
        System.out.println("in show()");
    }
    public void config(){
        System.out.println("in config()");
    }
    public void run(){
        System.out.println("Run fast");
    }

}

public class Demo {
    public static void main(String[] args) {
    A obj = new B();
    obj.show();
    obj.config();

    X obj1 = new B();
    obj1.run();

   // A.city = "Noida";   // can't change as it is final
    System.out.println(A.city);
    }
}
