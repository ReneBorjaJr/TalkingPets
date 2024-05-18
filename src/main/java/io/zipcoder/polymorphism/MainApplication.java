package io.zipcoder.polymorphism;

import java.util.*;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();

        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfPets; i++) {
            String petType;
            while (true) {
                System.out.println("What kind of pet is pet number " + (i + 1) + "? (we only support dogs, cats, and birds)");
                petType = scanner.nextLine().trim().toLowerCase();
                if (petType.equals("dog") || petType.equals("cat") || petType.equals("bird")) {
                    break;
                } else {
                    System.out.println("Please choose a supported animal (cat, dog, or bird).");
                }
            }


            System.out.println("What is the name of this pet?");
            String petName = scanner.nextLine();
            petName = petName.substring(0, 1).toUpperCase() + petName.substring(1);

            switch (petType) {
                case "dog":
                    pets.add(new Dog(petName));
                    break;
                case "cat":
                    pets.add(new Cat(petName));
                    break;
                case "bird":
                    pets.add(new Bird(petName));
                    break;
            }
        }
        // comparable
        System.out.println("===============COMPARABLE===============");
        Collections.sort(pets);
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " says " + pet.speak());
        }
        System.out.println("===============COMPARATOR===============");
        // comparator
        Comparator<Pet> petTypeComparator = new PetTypeComparator();
        pets.sort(petTypeComparator);
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " says " + pet.speak());
        }

    }

    }






