package abstractfactory;

import abstractfactory.example.factories.PizzaFactory;
import abstractfactory.example.pizza.Pizza;
import abstractfactory.example.pizza.PizzaType;

public class AbstractFactory {

    public static void main(String[] args) {
        Pizza margharita = PizzaFactory.createPizza(PizzaType.MARGO, 32);
        Pizza capriciosa = PizzaFactory.createPizza(PizzaType.CAPRI, 42);
        Pizza frutti = PizzaFactory.createPizza(PizzaType.FRUTTI, 42);
        System.out.println(margharita);
        System.out.println(capriciosa);
        System.out.println(frutti);
    }
}
