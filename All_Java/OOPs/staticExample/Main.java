package OOPs.staticExample;

public class Main {
    public static void main(String[] args) {
        // Ansh & Rahul are objects of class Human

        Human Ansh = new Human(23,"Ansh",40000,false);
        Human Rahul = new Human(26,"Rahul",60000,true);

        System.out.println(Ansh.population);  // it's right but convention is Human.population
        System.out.println(Rahul.population);

      /*  Convention is :
        System.out.println(Human.population);
        System.out.println(Human.population);
        */
    }
}
