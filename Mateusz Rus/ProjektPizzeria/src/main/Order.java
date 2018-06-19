/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.Pizzas.*;
import main.drinks.*;

import java.util.ArrayList;

/**
 *
 * @author Chasmer
 */
public class Order {
    private ArrayList<Pizza> pizzas;
    private ArrayList<Drink> drinks;
    private DeliveryMethod delivery;
    private double orderValue;

    public Order(ArrayList<Pizza> pizzas, ArrayList<Drink> drinks, DeliveryMethod delivery, double orderValue)
    {
        this.setPizzas(pizzas);
        this.setDrinks(drinks);
        this.setDelivery(delivery);
        this.setOrderValue(orderValue);
    }


    public ArrayList<Pizza> getPizzas() {
        return pizzas;
    }

    public void setPizzas(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public DeliveryMethod getDelivery() {
        return delivery;
    }

    public void setDelivery(DeliveryMethod delivery) {
        this.delivery = delivery;
    }

    public double getOrderValue() {
        for(Pizza p: pizzas)
        {
            this.orderValue += p.getPrice();
        }
        for(Drink d: drinks)
        {
            this.orderValue+= d.getPrice();
        }
        if(this.delivery == DeliveryMethod.TOHOME) orderValue += 3.0;

        return orderValue;
    }

    public void setOrderValue(double orderValue) {
        this.orderValue = orderValue;
    }
}
