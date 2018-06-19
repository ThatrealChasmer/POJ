package main.drinks;

public class SpriteDrink implements Drink {
    @Override
    public String getName() {
        return "Sprite";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
