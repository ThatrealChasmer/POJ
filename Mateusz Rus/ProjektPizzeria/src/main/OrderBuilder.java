package main;

import main.Pizzas.*;
import main.drinks.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static main.DeliveryMethod.*;

public class OrderBuilder {
    OrderBuilder(){

    }

    public Order createOrder()
    {
        return new Order(new ArrayList<Pizza>(), new ArrayList<Drink>(), null, 0.0);
    }

    public void addPizza(Order order, Pizza pizza)
    {
       ArrayList<Pizza> pizzas = order.getPizzas();
       pizzas.add(pizza);
       order.setPizzas(pizzas);
    }

    public void addDrink(Order order, Drink drink)
    {
        ArrayList<Drink> drinks = order.getDrinks();
        drinks.add(drink);
        order.setDrinks(drinks);
    }

    public void setDelivery(Order order, DeliveryMethod delivery)
    {
        order.setDelivery(delivery);
    }
}
