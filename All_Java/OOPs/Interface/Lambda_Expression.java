package OOPs.Interface;
interface G {
    void dance();
}

public class Lambda_Expression {
        public static void main(String[] args) {
            G obj = () -> {                     // Lambda Expression
                    System.out.println("I am Dancing");
                };
            obj.dance();
        }
    }

//    void dance(int i);
//
// public static void main(String[] args) {
//    G obj = i -> System.out.println("I am Dancing"+ i);  if you have 1 argument you
                                                            // don't need give 1st brackets (parenthesis)
//    obj.dance(3);
// }


