package OOPs.Encapsulation;

/* setter: method sets or updates the value of a private variable
   getter: method retrieves the value of a private variable
 */

 class Don{

        private int age= 23;       // private means it is only usable in same class
        private String name = "Rick";

        public int getAge(){  // Getters
            return age;
        }
        public void setAge(int newAge){  // Setters
            this.age=newAge;
        }
        public String getName(){
            return name;
        }
        public void setName(String newName){
            this.name = newName;
        }

    }

    public class Getters_Setters{
        public static void main(String[] args) {
            Don obj = new Don();
//        obj.age = 20;     // can't use as private
//        obj.name = "Rick";

            obj.setAge(20);
            obj.setName("Rick");

            System.out.println(obj.getAge()+" "+ obj.getName());
        }
    }


