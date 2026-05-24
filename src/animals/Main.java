package animals;

public class Main {
    public static void main(String[] args) {
        HomeAnimal<Dog> homeDog = new HomeAnimal<>(new Dog("Rex"));
        homeDog.getAnimal().run();
        homeDog.getAnimal().speak();
        homeDog.showType();
        homeDog.sleepOnTheCouch();

        System.out.println("----------");
        HomeAnimal<Cat> homeCat = new HomeAnimal<>(new Cat("Whiskers"));
        homeCat.getAnimal().run();
        homeCat.getAnimal().speak();
        homeCat.showType();
        homeCat.sleepOnTheCouch();

        System.out.println("----------");
        System.out.println("Shark cannot be a HomeAnimal! (compile error if you try)");
    }
}