package strategy.example;

public class GooglePay implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Cost: " + (amount * 0.9) + "$, paid with GooglePay");
    }
}
