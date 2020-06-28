package templatemethod;

import templatemethod.example.Capriciosa;
import templatemethod.example.Margharita;
import templatemethod.example.Pizza;

public class TemplateMethod {

    public static void main(String[] args) {
        Pizza margharita = new Margharita();
        Pizza capriciosa = new Capriciosa();
        margharita.bakingPizza();
        System.out.println("-----------------");
        capriciosa.bakingPizza();

    }

}
