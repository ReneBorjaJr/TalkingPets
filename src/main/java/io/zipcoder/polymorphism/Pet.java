package io.zipcoder.polymorphism;

import java.lang.Comparable;

public class Pet implements Comparable<Pet> {

    private String name;

    public Pet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String speak() {
        return "I'm a pet!";
    }

    @Override
    public int compareTo(Pet otherPet) {
        int nameComparison = this.name.compareTo(otherPet.name);
        if (nameComparison != 0) {
            return nameComparison;
        }
        return this.getClass().getSimpleName().compareTo(otherPet.getClass().getSimpleName());
    }
}


