package main;

import main.Ingredients.*;
import main.Pizzas.Pizza;
import main.drinks.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        public static void  main(String[] args){

            Scanner read = new Scanner(System.in);

            System.out.println("Witaj w pizzerii");
            System.out.println("Czy chcialbys zlozyc zamowienie? 1.Tak/2.Nie");

            int ans = read.nextInt();

            if(ans == 2) System.exit(0);
            else if (ans == 1) {
                System.out.println("Test");
                Order order = new OrderBuilder().createOrder();
                order = new Facade().pizza(read,ans,order);

                order = new Facade().napoj(read,ans,order);

                order = new Facade().dostawa(read,ans,order);

                new Display().displayOrder(order);
            }
        }
}
