package OOPs.Inheritance;

public class Box {
    double h;
    double l;
    double w;

    // No argument
    Box(){
        this.h=-1;
        this.l=-1;
        this.w=-1;
    }

    // taking 1 argument
    Box(double side){
        this.w=side;
        this.h=side;
    }
 // 3 argument
    Box(double l, double h, double w){
        this.h=h;
        this.l=l;
        this.w=w;
    }
    Box(Box old){    // constructor inside a constructor
        this.h=old.h;
        this.l=old.l;
        this.w=old.w;
    }
    public void information(){
        System.out.println("Running the Box");
    }
}
