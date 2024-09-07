package OOPs.Encapsulation;

 class Don{

        private int age= 23;       // private means it is only usable in same class
        private String name = "Rick";

        public int getAge(){  // Getters
            return age;
        }
        public void setAge(int age){  // Setters
            this.age=age;
        }
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
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


