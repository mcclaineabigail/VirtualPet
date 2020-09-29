package virtual_pet;

import java.util.Scanner;

public class Application {


    public static void main(String[] args) {
        System.out.println("Welcome to Fuzzy Virtual Pet Shelter!");
        System.out.println("We just had our first pet arrive, what would you like to name it?");

        PetShelter shelter = new PetShelter();
        shelter.addVirtualPet();

        for (VirtualPet petsToDisplay : shelter.retrievePets()) {
            System.out.println(petsToDisplay.status());
        }
        System.out.println("Would you like to interact with the new pet or add a second pet?");
        System.out.println("Enter: \"Interact\" or \"Add\"");
        Scanner input = new Scanner(System.in);
        String gamePlay = input.nextLine();
        if (gamePlay.equalsIgnoreCase("Interact")) {
            System.out.println("To interact with, please enter: \"Feed\", \"Hydrate\", \"Snuggle\", \"Maintain\", or \"Walk\" (to walk all dogs).");
            System.out.println("If you have a robotic pet, Feed will add fuel and Hydrate will lubricate Joints.");
            gamePlay = input.nextLine();
        }

        while (!gamePlay.equalsIgnoreCase("End Game")) {
            if (gamePlay.equalsIgnoreCase("Feed")) {
                shelter.feedAllPets();
            }
            if (gamePlay.equalsIgnoreCase("Hydrate")) {
                shelter.hydrateAllPets();
            }
            if (gamePlay.equalsIgnoreCase("Snuggle")) {
                System.out.println("Who do you want to snuggle?");
                System.out.println("Choose from:");
                for (VirtualPet petsToDisplay : shelter.retrievePets()) {
                    System.out.println(petsToDisplay.toString());
                }
                String petBeingSnuggled = input.nextLine().toUpperCase();
                shelter.shouldBeAbleToSnuggleOnePet(petBeingSnuggled);
            }
            if (gamePlay.equalsIgnoreCase("Add")) {
                shelter.addVirtualPet();
            }
            if (gamePlay.equalsIgnoreCase("Remove")) {
                System.out.println("Who is being adopted?");
                String petBeingAdopted = input.nextLine().toUpperCase();
                shelter.removeVirtualPet(petBeingAdopted);
            }
            if (gamePlay.equalsIgnoreCase("Walk")){ //**********************************************
                for (VirtualPet walkablePets : shelter.retrievePets())
                if(walkablePets instanceof Walkable){
                    //type animal.fly  (called casting)
                    ((Walkable) walkablePets).walk();
                }}
            if (gamePlay.equalsIgnoreCase("Maintain")){ //**********************************************
                shelter.maintainAllPets();}
            shelter.tickAllPets();
            for (VirtualPet petsToDisplay : shelter.retrievePets()) {
                System.out.println(petsToDisplay.status());
            }
            System.out.println("Would you like to \"Feed\", \"Hydrate\", \"Snuggle\", \"Walk\", \"Maintain\" \"Add\" ,\"Remove\", or \"End Game\" ?");
            gamePlay = input.nextLine();
        }
        System.out.println("Thank you for playing!");


    }


}


