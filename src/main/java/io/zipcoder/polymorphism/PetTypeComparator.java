package io.zipcoder.polymorphism;

import java.util.Comparator;

public class PetTypeComparator implements Comparator<Pet> {
    @Override
    public int compare(Pet pet1, Pet pet2) {
        int typeComparison = pet1.getClass().getSimpleName().compareTo(pet2.getClass().getSimpleName());

        if (typeComparison != 0) {
            return typeComparison;
        }
        return pet1.getName().compareTo(pet2.getName());
    }
}
