package polymorphism;

public class Main {

    public static void main(String[] args) {
        Dog midnight = new Dog("Midnight");
        //System.out.println(midnight.noise());
        Cat maisey = new Cat("Maisey");
        //System.out.println(carlton.noise());
        Animal jack = new Dog("Jack");
        Animal link = new Cat("Link");

        Kingdom kingdom = new Kingdom();
        kingdom.addAnimal(midnight);
        kingdom.addAnimal(jack);
        kingdom.addAnimal(link);
        kingdom.makeNoises();

    }
}
