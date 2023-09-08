package org.launchcode.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;


public class Restaurant {

    public static void main(String[] args) {
	// write your code here

        Menu menu = new Menu(LocalDate.now(), new ArrayList<MenuItem>());

        MenuItem gelato = new MenuItem(9, "gelato", "Dessert", false);
        MenuItem gelato1 = new MenuItem(9, "gelato", "Dessert", false);
        MenuItem pizza = new MenuItem(10, "pizza", "Main Course", false);

        menu.addMenuItem(gelato);
        menu.addMenuItem(gelato1);
        menu.addMenuItem(pizza);

        menu.addMenuItem(new MenuItem(8, "pasta", "Main Course", false));
        menu.addMenuItem(new MenuItem(5, "gnocchi", "Appetizer", false));

        menu.printMenu(menu);
        menu.printMenuItem(gelato);
        System.out.println(gelato);

        System.out.println(gelato.equals(gelato1));
        System.out.println(gelato.equals(pizza));

    }
}
