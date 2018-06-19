package main.drinks;

public class FantaDrink implements Drink {
    @Override
    public String getName() {
        return "Fanta";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
