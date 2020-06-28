package builder;

import builder.example.Pizza;

public class Builder {

    public static void main(String[] args) {
        Pizza margharita = new Pizza.PizzaBuilder("Margharita", 50).addChees(true)
                .addSauce(true).takeaway(true).build();
        Pizza capriciosa = new Pizza.PizzaBuilder("Capriciosa", 42).addChees(true)
                .addSauce(false).takeaway(false).build();
        System.out.println(margharita);
        System.out.println(capriciosa);

    }
}
