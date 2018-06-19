/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.ArrayList;

import main.Ingredients.TomatoIngredient;
import main.Ingredients.*;
import main.Pizzas.*;

/**
 *
 * @author Chasmer
 */
public class PizzaFactory {
    PizzaFactory()
    {
        
    }
    
    Pizza CreatePizza(PizzaSize size, PizzaType type)
    {
        String name = null;
        double price = 0.0;
        ArrayList<Ingredient> ingredients = null;
        int hotLevel = 0;
        switch(type) {
            case VEGETARIANA:
                name = "Vegetariana";
                price = new VegetarianaList().getPrice(size);
                ingredients = new VegetarianaList().getIngredients();
                hotLevel = new VegetarianaList().getHotLevel();
                break;
            case CAPPRICIOSA:
                name = "Capriciosa";
                price = new CapriciosaList().getPrice(size);
                ingredients = new CapriciosaList().getIngredients();
                hotLevel = new CapriciosaList().getHotLevel();
                break;
            case PEPPERONI:
                name = "Pepperoni";
                price = new PepperoniList().getPrice(size);
                ingredients = new PepperoniList().getIngredients();
                hotLevel = new PepperoniList().getHotLevel();
                break;
        }
        return new Pizza(name, size, ingredients, price, hotLevel);
    }
}
