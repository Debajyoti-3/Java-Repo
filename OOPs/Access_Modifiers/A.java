package OOPs.Access_Modifiers;

public class A {
    private int num;
    String name;
    int[] arr;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public A(int num, String name){
        this.num = num;
        this.arr = new int[num];
        this.name = name;
    }
}
