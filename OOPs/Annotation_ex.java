package OOPs;

class AA {
    public void show(){
        System.out.println("In AA class");
    }
}
class BB extends AA{

    @Override    // a Annotation : it helps to find overriding
    public void show(){     // Method Overriding
        System.out.println("In BB class");
    }
}

public class Annotation_ex {
    public static void main(String[] args) {
        BB obj = new BB();
        obj.show();
    }
}
