package main.drinks;

public class BeerDrink implements Drink {
    @Override
    public String getName() {
        return "Piwo";
    }

    @Override
    public double getPrice() {
        return 6.00;
    }
}
