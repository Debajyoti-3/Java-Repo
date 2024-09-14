package Data_Structures.Stack;

import java.util.ArrayList;

public class AL_implement {
    ArrayList<Integer> list = new ArrayList<>();

    public boolean isEmpty() {
        return list.size() == 0;
    }

    public int pop() {
        int top = list.get(list.size() - 1);
        list.remove(list.size() - 1);
        return top;
    }

    public void push(int data) {
        list.add(data);
    }

    public int peek() {
        if (isEmpty()) {
            return -1;
        }
        return list.get(list.size() - 1);

    }

    public static void main(String args[]) {
        AL_implement s = new AL_implement();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
