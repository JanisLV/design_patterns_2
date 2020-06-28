package decorator.example;

public class MushroomsPizza extends PizzaDecorator {

    public MushroomsPizza(Pizza pizza) {
        super(pizza);
//        super.addIngredients("Mushrooms");
    }

    @Override
    public void printIngredients() {
        super.printIngredients();
        System.out.println("and Mushrooms");
    }
}
