package OOPs.staticExample;

public class Human {

        int age;
        String name;
        int salary;
        boolean married;
        static long population;  // static means it's gonna same for all
                                 // static variables don't depend upon Objects
        public Human(int age, String name, int salary, boolean married){
            this.age = age;
            this.married = married;
            this.name = name;
            this.salary = salary;
            Human.population += 1; // as population is static we use
                                   // Human. instead od this.
        }

    }


