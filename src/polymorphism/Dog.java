package polymorphism;

public class Dog extends Animal implements Noisy {

    public Dog(String name) {
        super(name);
    }

    @Override
    public String noise(){
        return "Ruff!";
    }
}
