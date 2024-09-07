package OOPs;

class Demo{
    public void run(){
        System.out.println("In Demo class");
    }
}

public class AnonymousI_InnerClass {
    public static void main(String[] args) {

        Demo obj =new Demo(){

            public void run(){                     // Anonymous Inner Class
                System.out.println("In fast method");
            }
        };
        obj.run();
    }
}
