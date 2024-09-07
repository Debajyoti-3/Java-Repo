package OOPs.Enum;
enum Status{
    Running, Pending, Succed, Failed;   // 0, 1, 2, 3
        }

public class Demo {
    public static void main(String[] args) {
   int i = 7;
   Status s = Status.Failed;
        System.out.println(s);
        System.out.println(s.ordinal());  // printing order
    }
}
