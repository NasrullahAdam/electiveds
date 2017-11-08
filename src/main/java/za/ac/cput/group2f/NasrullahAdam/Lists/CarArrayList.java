package za.ac.cput.group2f.NasrullahAdam.Lists;

import za.ac.cput.group2f.NasrullahAdam.Car;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CarArrayList {

    public static void main(String[] args){
        Car c1 = new Car();
        c1.setModel(418);
        c1.setBrand("Honda");

        Car c2 = new Car();
        c2.setModel(856);
        c2.setBrand("Pagani");

        Car c3 = new Car();
        c3.setModel(952);
        c3.setBrand("Audi");

        Car c4 = new Car();
        c4.setModel(418);
        c4.setBrand("Datsun");

        List garageDups = new ArrayList();
        garageDups.add(c1);
        garageDups.add(c2);
        garageDups.add(c3);
        garageDups.add(c4);

        System.out.println("The number of cars in the list are " + garageDups.size());

        Set garageNoDups = new HashSet();
        garageNoDups.add(c1);
        garageNoDups.add(c2);
        garageNoDups.add(c3);
        garageNoDups.add(c4);

        System.out.println ("The number of cars in the set are " + garageNoDups.size());
    }
}
