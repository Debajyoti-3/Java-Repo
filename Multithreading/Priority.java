package Multithreading;


class C extends Thread{    // extending Thread class
    public void run(){
        for(int i= 0; i<=5; i++){
            System.out.println("Kolkata");
        }
    }
}
class D extends Thread{    // extending Thread class
    public void run(){           // run() mandatory for Thread
        for(int i= 0; i<=5; i++){
            
            System.out.println("Mumbai");
        }
    }
}

public class Priority {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        obj2.setPriority(Thread.MAX_PRIORITY);
        obj1.start();   // start() mandatory for Thread
        obj2.start();
    }
}
