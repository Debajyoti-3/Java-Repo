package OOPs.Interface;

@FunctionalInterface            // Annotation
interface Joy{
    int clay(int i, int j);

}
public class Lambda_withReturn {
    public static void main(String[] args) {
            OOPs.Interface.Joy obj = (i,j)-> i+j;          // Lambda Expression

        int result = obj.clay(3, 7);
        System.out.println(result);
        }
    }


