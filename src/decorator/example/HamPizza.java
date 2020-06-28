package decorator.example;

public class HamPizza extends PizzaDecorator {

    public HamPizza(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void printIngredients() {
        super.printIngredients();
        System.out.println("and Ham");
    }
}