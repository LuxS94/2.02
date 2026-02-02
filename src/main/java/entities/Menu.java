package entities;

import entities.Drinks.Drinks;
import entities.Pizze.Pizzas;
import entities.Toppings.Toppings;

import java.util.ArrayList;

public class Menu {
    public ArrayList<Pizzas> pizze;
    public ArrayList<Drinks> drink;
    public ArrayList<Toppings> topping;

    public Menu(ArrayList<Pizzas> pizze, ArrayList<Toppings> topping, ArrayList<Drinks> drink) {
        this.pizze = pizze;
        this.topping = topping;
        this.drink = drink;
    }

    public String printMenu() {
        return "Menu : " +
                "pizze= " + pizze +
                "; drink= " + drink +
                "; topping= " + topping +
                '.';
    }
}
