package abstractfactory.example.factories;

import abstractfactory.example.pizza.Pizza;
import abstractfactory.example.pizza.PizzaType;

public class PizzaFactory {

    public static Pizza createPizza(PizzaType type, int size) {
        Pizza pizza = null;
        if (type.equals(PizzaType.MARGO)) {
            pizza = new MargharitaFactory().create(size);
        }
        if (type.equals(PizzaType.CAPRI)) {
            pizza = new CapriciosaFactory().create(size);
        }
        if (type.equals(PizzaType.FRUTTI)) {
            pizza = new FruttiTuttiFactory().create(size);
        }
        return pizza;
    }
}

