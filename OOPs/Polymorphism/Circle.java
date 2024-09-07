package OOPs.Polymorphism;

public class Circle extends Shapes{

    @Override   // it checks method is overridding or not
    void area(){
        System.out.println("Area is Pi * r * r");
    }
}
