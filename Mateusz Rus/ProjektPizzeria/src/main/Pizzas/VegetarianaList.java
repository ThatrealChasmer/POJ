package main.Pizzas;

import main.Ingredients.*;
import main.PizzaSize;

import java.util.ArrayList;

public class VegetarianaList implements IngredientList {

    @Override
    public ArrayList<Ingredient> getIngredients() {
        ArrayList<Ingredient> ingredients = new ArrayList<>();
        ingredients.add(new CheeseIngredient());
        ingredients.add(new PepperIngredient());
        ingredients.add(new TomatoIngredient());
        return ingredients;
    }

    @Override
    public double getPrice(PizzaSize size) {

        double price = 0.0;

        switch (size)
        {
            case SMALL: price = 20.0; break;
            case MEDIUM: price = 25.0; break;
            case LARGE: price = 30.0; break;
        }

        return price;
    }

    @Override
    public int getHotLevel() {
        return 0;
    }
}
