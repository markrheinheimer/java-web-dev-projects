package org.launchcode.restaurant;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Menu menu = new Menu(LocalDate.now(), new ArrayList<MenuItem>());

        menu.getItems().add(new MenuItem(10, "pizza", "Main Course", false));

        for (MenuItem items : menu.getItems()) {
            System.out.println(items.getDescription());
        }
    }
}
