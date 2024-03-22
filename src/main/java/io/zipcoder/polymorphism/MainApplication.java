package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Declare and initialize a list to store pets. It uses polymorphism to store different types of pets.
        List<Pet> pets = new ArrayList<>();

        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfPets; i++) {
            String petType = "";
            while (true) {
                System.out.println("What kind of pet is pet number " + (i + 1) + "? (we only support dogs, cats, and birds)");
                petType = scanner.nextLine().trim().toLowerCase();
                if (petType.equals("dog") || petType.equals("cat") || petType.equals("bird")) {
                    break; // Exit the loop if the user enters a supported animal
                } else {
                    System.out.println("Please choose a supported animal (cat, dog, or bird).");
                }
            }


            System.out.println("What is the name of this pet?");
            String petName = scanner.nextLine();

            // Use a switch statement to create an instance of the appropriate Pet subclass based on the pet type
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
            }
        }
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " says " + pet.speak());
        }
    }

    }






