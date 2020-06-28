package builder;

import builder.example.Block;
import builder.example.Pizza;

public class Builder {

    public static void main(String[] args) {
        Pizza margharita = new Pizza.PizzaBuilder("Margharita", 50)
                .addChees(true)
                .addSauce(true)
                .takeaway(true).build();
        Pizza capriciosa = new Pizza.PizzaBuilder("Capriciosa", 42).addChees(true)
                .addSauce(false).takeaway(false).build();
        System.out.println(margharita);
        System.out.println(capriciosa);

        Block block = new Block.BlockBuilder()
                .color("Red")
                .name("Square")
                .build();
        System.out.println(block);

    }
}
