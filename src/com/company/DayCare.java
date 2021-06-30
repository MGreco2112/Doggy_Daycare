package com.company;


import java.util.ArrayList;

public class DayCare {

    ArrayList<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal newAnimal) {
        animals.add(newAnimal);
    }

    public void displayAnimals() {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i) instanceof Dog) {
                System.out.println("Dog\n" + animals.get(i));
            } else if (animals.get(i) instanceof Cat) {
                System.out.println("Cat\n" + animals.get(i));
            } else {
                System.out.println("Animal\n" + animals.get(i));
            }
        }
    }

    public void removeAnimal(String name) {
        for (int i = 0; i < animals.size(); i++) {
            if (animals.get(i).name.equals(name)) {
                animals.remove(i--);
            }
        }
    }

    public void animalNoises() {
        for (int i = 0; i < animals.size(); i++) {


            System.out.println(animals.get(i).name + " goes " + animals.get(i).speak());
        }
    }



}
