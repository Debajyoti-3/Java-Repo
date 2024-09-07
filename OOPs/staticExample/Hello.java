package OOPs.staticExample;

public class Hello {
    public static void main(String[] args) {
        // greet();  /* as greet() is not static we
                     //can not use in static
        }

        void hello(){
        greet();  // As hello is not also static
        }         // we can use greet here

  static void fun(){
    /* you cannot access non-static without referencing their instances in
    a static context

    hence, hee I am referencing it
     */
       Hello obj = new Hello();
        obj.greet();
  }
    // we know that which is not static, belongs to an object
    void greet(){
        System.out.println("Welcome Buddy !");
    }
}
