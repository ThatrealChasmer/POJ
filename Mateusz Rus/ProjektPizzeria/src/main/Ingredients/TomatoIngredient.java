/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main.Ingredients;

/**
 *
 * @author Chasmer
 */
public class TomatoIngredient implements Ingredient{
    @Override
    public String getName()
    {
        return "Pomidor";
    }
    
    @Override
    public double getPrice()
    {
        return 1.00;
    }
}
