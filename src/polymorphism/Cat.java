package polymorphism;

public class Cat extends Animal implements Noisy{

    public Cat(String name){
        super(name);
    }

    @Override
    public String noise() {
        return "Meow!";
    }
}
