package OOPs.Abstraction;

abstract class Car{
    public abstract void drive();
    public abstract void speed();

    public void playMusic(){
        System.out.println("Playing Music");
    }
}
abstract class swift extends Car{    // concrete class

    public void drive(){
        System.out.println("Driving...");
    }
}
class ExtendedSwift extends swift{
    public void speed(){
        System.out.println("Gainning speed");
    }
}

public class Abstract_Classes {
    public static void main(String[] args) {
        // Car obj = new Car();          you can't create an object of an abstract class here new Car()
        Car obj = new ExtendedSwift();
        obj.drive();
        obj.playMusic();
        obj.speed();
    }
}
