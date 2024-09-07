package OOPs.Enum;
enum Status1{
    Pending, Failed, Succed, Running;
}

public class If_Case {
    public static void main(String[] args) {
        Status1 s1 = Status1.Succed;

        if(s1 == Status1.Pending){
            System.out.println("Pls wait");
        }
        else if(s1 == Status1.Failed){
            System.out.println("Try again");
        }
        else if(s1 == Status1.Running){
            System.out.println("All Good");
        }
        else{
            System.out.println("Done");
        }
    }
}
