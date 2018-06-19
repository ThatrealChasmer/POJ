package main.drinks;

public class JuiceDrink implements Drink {
    @Override
    public String getName() {
        return "Sok";
    }

    @Override
    public double getPrice() {
        return 5.00;
    }
}
