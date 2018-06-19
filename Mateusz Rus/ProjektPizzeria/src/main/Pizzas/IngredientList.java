package main.Pizzas;

import main.Ingredients.Ingredient;
import main.PizzaSize;

import java.util.ArrayList;

public interface IngredientList {
    ArrayList<Ingredient> getIngredients();
    double getPrice(PizzaSize size);
    int getHotLevel();
}
