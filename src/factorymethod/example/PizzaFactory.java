package factorymethod.example;


public class PizzaFactory {

    public Pizza getPizza(int number) {
        Pizza pizza;
        switch (number) {
            case 1:
                pizza = new Margharita();
                break;
            case 2:
                pizza = new Capriciosa();
                break;
            case 3:
                pizza = new FruttiTutti();
                break;
            default:
                pizza = null;
                break;
        }
        return pizza;
    }
}