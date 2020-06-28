package abstractfactory.example.factories;

import abstractfactory.example.pizza.FruttiTutti;
import abstractfactory.example.pizza.Pizza;

public class FruttiTuttiFactory implements PizzaAbstractFactory{
    @Override
    public Pizza create(int size) {
        return new FruttiTutti(size);
    }
}
