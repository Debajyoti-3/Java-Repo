package OOPs.Encapsulation;

/* Technically in encapsulation, the variables or data of a class is hidden
  from any other class and can be accessed only through any member function
  of its own class in which it is declared. */

class Good{
      private int age= 23;  // private means it is only usable in same class
      private String name = "Rick";

      public int getAge(){
          return age;
      }
      public void setAge(int a){
          age=a;
      }
      public String getName(){
          return name;
      }
      public void setName(String n){
          name = n;
      }
}

public class Demo {
    public static void main(String[] args) {
        Good obj = new Good();
//        obj.age = 20;     // can't use as private
//        obj.name = "Rick";

        obj.setAge(20);
        obj.setName("Rick");

        System.out.println(obj.getAge()+" "+ obj.getName());
    }
}
