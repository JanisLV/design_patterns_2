package singleton.example;

public class Animal{

    private static Animal instance = null;

    public String name;

    private Animal() {
        name = "Dog";
    }

    public static Animal getInstance() {
        if (instance == null) {
            instance = new Animal();
        }
        return instance;
    }

    @Override
    public String toString() {
        return "Animal name: " + name;
    }

}