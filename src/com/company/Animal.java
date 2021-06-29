package com.company;

public class Animal {

    public int legs;
    public String size;
    public String name;
    public Boolean isFixed;
    public Boolean isOwned;



    public Animal (int legs, String size, String name, Boolean isFixed, Boolean isOwned) {
        this.legs = legs;
        this.size = size;
        this.name = name;
        this.isFixed = isFixed;
        this.isOwned = isOwned;
    }

    public String speak() {
        return "---";
    }

    public String toString() {
        return String.format("Name: %s, Legs: %s, Size: %s", this.name, this.legs, this.size);
    }

}
