package main.drinks;

public class CokeDrink implements Drink {
    @Override
    public String getName() {
        return "Cola";
    }

    @Override
    public double getPrice() {
        return 4.00;
    }
}
