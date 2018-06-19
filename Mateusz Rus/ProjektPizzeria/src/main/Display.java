package main;

import main.Ingredients.*;
import main.Pizzas.Pizza;
import main.drinks.Drink;

public class Display {
    Display(){

    }

    public void displayPizza(Pizza pizza){
        System.out.println(pizza.getName());
        for (Ingredient i: pizza.getIngredients()) {
            System.out.println("\t"+i.getName());
        }
        System.out.println("Poziom ostrosci: "+pizza.getHotLevel());
        System.out.println("Rozmiar: "+pizza.getSize());
        System.out.println("Cena pizzy: "+pizza.getPrice());
    }

    public void displayOrder(Order order){
        for(Pizza p: order.getPizzas())
        {
            displayPizza(p);
        }

        System.out.println();

        for(Drink d: order.getDrinks())
        {
            System.out.println(d.getName()+ " " + d.getPrice());
        }

        System.out.println();

        switch(order.getDelivery())
        {
            case ATLOCAL: System.out.println("Rodzaj Dostawy: Na miejscu"); break;
            case TAKEAWAY: System.out.println("Rodzaj Dostawy: Na wynos"); break;
            case TOHOME: System.out.println("Rodzaj Dostawy: Dostawa"); break;
        }

        System.out.println();
        System.out.println("Koszt zamowienia: "+order.getOrderValue());

    }
}
