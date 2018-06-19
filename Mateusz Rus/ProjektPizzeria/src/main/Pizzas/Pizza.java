/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Pizzas;

import main.Ingredients.Ingredient;
import main.PizzaSize;

import java.util.ArrayList;
/**
 *
 * @author Chasmer
 */
public class Pizza {
    private String name;
    private PizzaSize size;
    private double price;
    private int hotLevel;
    private ArrayList<Ingredient> ingredients;

    public Pizza(String name, PizzaSize size, ArrayList<Ingredient> ingredients, double price, int hotLevel){
        this.setName(name);
        this.setSize(size);
        this.setPrice(price);
        this.setHotLevel(hotLevel);
        this.setIngredients(ingredients);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PizzaSize getSize() {
        return size;
    }

    public void setSize(PizzaSize size) {
        this.size = size;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getHotLevel() {
        return hotLevel;
    }

    public void setHotLevel(int hotLevel) {
        this.hotLevel = hotLevel;
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
