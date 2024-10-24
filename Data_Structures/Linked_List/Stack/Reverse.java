package Data_Structures.Stack;
import java.util.*;


public class Reverse {
    public static void push_AtBottom(int data, Stack<Integer> s) {
            if (s.isEmpty()) {
                s.push(data);
                return;
            }
            int top = s.pop();
            push_AtBottom(data,s);
            s.push(top);
        }

     static void reverse(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
      int top = s.pop();
        reverse(s);
        push_AtBottom(top,s);
    }
        public static void main(String[] args) {
            Stack<Integer> s = new Stack<>();
            s.push(1);
            s.push(2);
            s.push(3);
            s.push(4);
            reverse(s);


            while (!s.isEmpty()) {
                System.out.println(s.peek());
                s.pop();
            }
        }
}




