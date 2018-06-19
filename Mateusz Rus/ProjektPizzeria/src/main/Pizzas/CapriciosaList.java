package main.Pizzas;

import main.Ingredients.*;
import main.PizzaSize;

import java.util.ArrayList;

public class CapriciosaList implements IngredientList {
    @Override
    public ArrayList<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new SauceIngredient());
        ingredients.add(new MushroomIngredient());
        ingredients.add(new HamIngredient());
        return ingredients;
    }

    @Override
    public double getPrice(PizzaSize size) {

        double price = 0.0;

        switch (size)
        {
            case SMALL: price = 22.0; break;
            case MEDIUM: price = 27.0; break;
            case LARGE: price = 32.0; break;
        }

        return price;
    }

    @Override
    public int getHotLevel() {
        return 1;
    }
}
