package base.animal;

public class AnimalTester {

    public static void main (String[] args) {


        //Part A
        Animal lisa = new Animal("carnivore", "lion", "Lisa");
        System.out.println(lisa.toString());

        //Part B
        Herbivore gary = new Herbivore("giraffe", "Gary");
        System.out.println(gary.toString());

        //Part C
        Elephant percy = new Elephant("Percy", 2.0);
        System.out.println(percy.toString());

    }

}
