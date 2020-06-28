package abstractfactory.example.pizza;

public class FruttiTutti extends Pizza {
    private final int size;

    public FruttiTutti(int size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return "FruttiTutti";
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String getIngredients() {
        return "Fruit, Tomato Sauce, Tuit, Candy";
    }
}
