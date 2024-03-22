package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Pet> pets = new ArrayList<>();

        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left-over

//        String[] petTypes = new String[numberOfPets];
//        String[] petNames = new String[numberOfPets];

        for (int i = 0; i < numberOfPets; i++) {
            System.out.println("What kind of pet is pet number " + (i + 1) + "?");
            String petType = scanner.nextLine();

            System.out.println("What is the name of this pet?");
            String petName = scanner.nextLine();

            switch (petType.toLowerCase()) {
                case "dog":
                    pets.add(new Dog(petName));
                    break;
                case "cat":
                    pets.add(new Cat(petName));
                    break;
                case "bird":
                    pets.add(new Bird(petName));
                    break;
                default:
                    System.out.println("Unsupported pet type.");
                    break;
            }
        }
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " says " + pet.speak());
        }

        // Print out the list of pets
//        for (int i = 0; i < numberOfPets; i++) {
//            System.out.println("Pet #" + (i + 1) + ": " + petTypes[i] + " named " + petNames[i]);
//        }


    }

    }






