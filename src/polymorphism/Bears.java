package polymorphism;

public class Bears extends Animal implements Noisy {

    public Bears(String name) {
        super(name);
    }

    @Override
    public String noise() {
        return "Roar!";
    }
}
