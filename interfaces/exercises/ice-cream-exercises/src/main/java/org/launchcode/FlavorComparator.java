package org.launchcode;

import java.util.Comparator;

<<<<<<< HEAD
public class FlavorComparator implements Comparator<Flavor>{
//    @Override
//    public int compare(Flavor o1, Flavor o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
    @Override
    public int compare(Flavor o1, Flavor o2) {
        return Integer.compare(o1.getAllergens().size(), o2.getAllergens().size());
=======
public class FlavorComparator implements Comparator<Flavor> {

    @Override
    public int compare(Flavor o1, Flavor o2) {
        return o1.getName().compareTo(o2.getName());
>>>>>>> b6d658d4dfb71c5ee912bbf414d7dce32fcbc6b8
    }
}
