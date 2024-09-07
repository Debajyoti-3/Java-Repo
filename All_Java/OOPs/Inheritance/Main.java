package OOPs.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();  // No argument passed

        // Box box3 = new Box(4);
        // Box box4 = new Box(1,2,3);

        // Box box2 = new Box(box1);

        //System.out.println(box1.h+" "+ box1.l+" "+ box1.w);
//        Box box7 = new BoxWeight(7, 5, 8, 33);
//        System.out.println(box7.weight);  // you can't weight here, here Box is reference type but BoxWeight is object type

        // Type reference is actually determine what you can access not the type of object

        BoxWeight box5 = new BoxWeight(); // No argument
        BoxWeight box6 = new BoxWeight(2, 3, 4, 20);
        System.out.println(box6.h+" "+ box6.l+" "+ box6.w+" "+box6.weight);
      // There are many variables in both parent and child classes
      // you are given access to variables that are in the ref. type i.e. BoxWeight
      // hence you should have access to weight variables
      // this also means, that the ones you are trying is access should be initialized
      // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // that is why ERROR !

      /*  BoxWeight box9 = new Box(2,5,6);
        System.out.println(box9.l;);
        */

        BoxPrice box = new BoxPrice();
        System.out.println(box.l);
    }
}
