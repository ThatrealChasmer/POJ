package main;

import main.Ingredients.*;
import main.Pizzas.Pizza;
import main.drinks.*;

import java.util.*;

public class Facade {
    Facade(){}

    public static Order pizza(Scanner read, int ans, Order order)
    {
        while (ans == 1) {
            System.out.println("Rodzaj pizzy?");
            System.out.println("1.Vegetariana");
            System.out.println("2.Capriciosa");
            System.out.println("3.Pepperoni");

            ans = read.nextInt();
            PizzaType type = null;
            switch (ans) {
                case 1:
                    type = PizzaType.VEGETARIANA;
                    break;
                case 2:
                    type = PizzaType.CAPPRICIOSA;
                    break;
                case 3:
                    type = PizzaType.PEPPERONI;
                    break;
            }

            System.out.println("Rozmiar pizzy?");
            System.out.println("1.Mala");
            System.out.println("2.Srednia");
            System.out.println("3.Duza");

            ans = read.nextInt();
            PizzaSize size = null;
            switch (ans) {
                case 1:
                    size = PizzaSize.SMALL;
                    break;
                case 2:
                    size = PizzaSize.MEDIUM;
                    break;
                case 3:
                    size = PizzaSize.LARGE;
                    break;
            }

            Pizza pizza = new PizzaFactory().CreatePizza(size, type);

            System.out.println("Dodatki? 1.Tak/2.Nie");
            ans = read.nextInt();

            if(ans==1)
            {
                String dod = null;
                ArrayList<Ingredient> addIng = new ArrayList<>();
                while(!"Nic".equals(dod))
                {
                    System.out.println("Jaki dodatek");
                    dod = read.nextLine();
                    switch(dod)
                    {
                        case "Ser": addIng.add(new CheeseIngredient()); break;
                        case "Szynka": addIng.add(new HamIngredient()); break;
                        case "Papryka Ostra": addIng.add(new HotPepperIngredient()); break;
                        case "Pieczarki": addIng.add(new MushroomIngredient()); break;
                        case "Cebula": addIng.add(new OnionIngredient()); break;
                        case "Papryka": addIng.add(new PepperIngredient()); break;
                        case "Salami": addIng.add(new SalamiIngredient()); break;
                        case "Sos": addIng.add(new SauceIngredient()); break;
                        case "Pomidor": addIng.add(new TomatoIngredient()); break;
                        case "Nic": break;
                        default: System.out.println("Bledny skladnik"); break;
                    }
                }
                new SpecialPizza().CreateSpecial(pizza, addIng);
            }

            new OrderBuilder().addPizza(order, pizza);

            System.out.println("Dodac inna? 1.Tak/2.Nie");
            ans = read.nextInt();
        }
        return order;
    }

    public static Order napoj(Scanner read, int ans, Order order)
    {
        System.out.println("Cos do picia? 1.Tak/2.Nie");

        ans = read.nextInt();

        while (ans == 1) {
            System.out.println("Wybierz");
            System.out.println("1.Cola");
            System.out.println("2.Fanta");
            System.out.println("3.Sprite");
            System.out.println("4.Sok");
            System.out.println("5.Piwo");

            ans = read.nextInt();
            Drink drink = null;
            switch (ans) {
                case 1:
                    drink = new CokeDrink(); break;
                case 2:
                    drink = new FantaDrink(); break;
                case 3:
                    drink = new SpriteDrink(); break;
                case 4:
                    drink = new JuiceDrink(); break;
                case 5:
                    drink = new BeerDrink(); break;
            }

            new OrderBuilder().addDrink(order, drink);

            System.out.println("Cos jeszcze? 1.Tak/2.Nie");
            ans = read.nextInt();
        }
        return order;
    }

    public static Order dostawa(Scanner read, int ans, Order order)
    {
        System.out.println("Sposob odbioru?");
        System.out.println("1.Na miejscu");
        System.out.println("2.Na wynos");
        System.out.println("3.Dostawa");

        ans = read.nextInt();
        switch(ans)
        {
            case 1: new OrderBuilder().setDelivery(order, DeliveryMethod.ATLOCAL); break;
            case 2: new OrderBuilder().setDelivery(order, DeliveryMethod.TAKEAWAY); break;
            case 3: new OrderBuilder().setDelivery(order, DeliveryMethod.TOHOME); break;
        }
        return order;
    }
}
