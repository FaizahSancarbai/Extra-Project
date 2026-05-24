package animals;

public class Cat extends Animal implements Run, Speak {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " the cat is running!");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Meow!");
    }
}