package OOPs.Interface;
//A functional interface is an interface that contains only one abstract method

//  also known as SAM (Single Abstract Method) interfaces

@FunctionalInterface            // Annotation
interface Boy{
    void play();
   //void good();
        }
// class C implements Boy{
//    public void play(){
//        System.out.println("I am Playing");
//    }
// }

public class Functional_interface {
    public static void main(String[] args) {
        Boy obj = new Boy() {                       // Anonymous Class
            public void play(){
                System.out.println("I am Playing");
            }
        };
        obj.play();
    }
}
