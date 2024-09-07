package OOPs.Enum;
enum Status2{
    Pending, Success, Failed, Running;
}

public class Switch_Case {
    public static void main(String[] args) {

        Status2 s2 = Status2.Pending;
        switch (s2){
            case Pending:                       // you don't need to wrie Status2 here
                System.out.println("Pls wait");
                break;
            case Failed:
                System.out.println("Try Again");
                break;
            case Running:
                System.out.println("All Good");
                break;
            default:
                System.out.println("Done");
                break;
        }
    }
}
