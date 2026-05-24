package animals;

public class HomeAnimal<T extends Animal & Run & Speak> {

    private T animal;
    public HomeAnimal(T animal) {
        this.animal = animal;
    }
    public T getAnimal() {
        return animal;
    }
    public void showType() {
        System.out.println("Type: " + animal.getClass().getSimpleName());
    }
    public void sleepOnTheCouch() {
        System.out.println(animal.getName() + " is sleeping on the couch... Zzzz");
    }
}