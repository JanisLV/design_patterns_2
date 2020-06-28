package singleton;

import singleton.example.Animal;
import singleton.example.Pizza;

import java.time.Instant;

public class Singleton {

    public static void main(String[] args) {
        Pizza margharita = Pizza.getInstance();
        margharita.name = "Margharita";
        Pizza capriciosa = Pizza.getInstance();
        capriciosa.name = "Capriciosa";
        Pizza fruttidimare = Pizza.getInstance();
        fruttidimare.name = "Frutti di mare";

        System.out.println(margharita);
        System.out.println(capriciosa);
        System.out.println(fruttidimare);

        Animal animal = Animal.getInstance();
        System.out.println(animal);
        animal.name = "Cat";
        System.out.println(animal);
        animal = Animal.getInstance();
        System.out.println(animal);


    }
}