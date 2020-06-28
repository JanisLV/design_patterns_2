package decorator;

import decorator.example.BasicPizza;
import decorator.example.HamPizza;
import decorator.example.MushroomsPizza;
import decorator.example.Pizza;

public class Decorator {

    public static void main(String[] args) {
        Pizza pizza = new BasicPizza();
        pizza.printIngredients();
        pizza = new HamPizza(pizza);
        pizza.printIngredients();
        pizza = new MushroomsPizza(pizza);
        pizza.printIngredients();

    }

}