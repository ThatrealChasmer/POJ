package main;

import main.Ingredients.*;
import main.Pizzas.*;

import java.util.ArrayList;

public class SpecialPizza extends PizzaFactory {

    public SpecialPizza(){
        super();
    }

    public void CreateSpecial(Pizza pizza, ArrayList<Ingredient> addIng)
    {
        ArrayList<Ingredient> ingredients = pizza.getIngredients();

        ingredients.addAll(addIng);
        pizza.setIngredients(ingredients);

        double price = pizza.getPrice();
        for(Ingredient i: addIng)
        {
            price = price + i.getPrice();
        }
        pizza.setPrice(price);
    }
}
