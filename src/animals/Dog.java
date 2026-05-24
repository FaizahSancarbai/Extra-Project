package animals;

public class Dog extends Animal implements Run, Speak {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println(getName() + " the dog is running!");
    }

    @Override
    public void speak() {
        System.out.println(getName() + " says: Woof!");
    }
}