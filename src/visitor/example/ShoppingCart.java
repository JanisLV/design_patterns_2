package visitor.example;


public interface ShoppingCart {

    int visit(Car car);

    int visit(Computer computer);

}