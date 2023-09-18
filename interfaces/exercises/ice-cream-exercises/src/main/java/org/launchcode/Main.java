package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();


        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.
//        Comparator comparator = new FlavorComparator();
//        flavors.sort(comparator);

        System.out.println("Flavor list before sorting by name:");
        for (Flavor flav : flavors) {
            System.out.println(flav.getName());
        }
        System.out.println("\n");

        flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.

        System.out.println("Cone list before sorting by price:");

        for (Cone eachCone : cones) {
            System.out.println(eachCone.getName());
        }
        System.out.println("\n");

        cones.sort(new ConeComparator());

            // TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.

        System.out.println("Flavor list after sorting:");
        for (Flavor flav : flavors) {
            System.out.println(flav.getName());
        }
        System.out.println("\n");


        System.out.println("Cone list after sorting by price:");
        for (Cone eachCone : cones) {
            System.out.println(eachCone.getName());
        }
        System.out.println("\n");


        System.out.println("Flavor list before sorting by number of allergens:");
        for (Flavor flav : flavors) {
            System.out.println(flav.getName());
        }
        System.out.println("\n");


        System.out.println("Flavor list after sorting by number of allergens:");


        flavors.sort(new FlavorComparator());

        for (Flavor flav : flavors) {
            System.out.println(flav.getName());
        }
        System.out.println("\n");


        }
    }
