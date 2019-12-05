package polymorphism;

import java.util.ArrayList;

public class Kingdom {
    private ArrayList<Animal> animals;

    public Kingdom(){
        this.animals = new ArrayList<Animal>();;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public ArrayList<Animal> getAnimals() {
        return animals;
    }

    public void makeNoises() {
        for(Animal a: this.getAnimals()){
            System.out.println(a.noise());
        }
    }

}
