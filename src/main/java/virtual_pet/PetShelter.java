package virtual_pet;

import java.util.*;

public class PetShelter {
    Map<String, VirtualPet> shelter = new HashMap<String, VirtualPet>();

    public void addPet(VirtualPet petToAdd){
        shelter.put(petToAdd.getPetName(), petToAdd );
    }

    public void addVirtualPet() {

        System.out.println("What type of animal is it?");
        System.out.println("Enter: \"Robotic Dog\", \"Robotic Cat\", or \"Organic Dog\", or \"Organic Cat\"");
        String typeofAnimal;
        Scanner input = new Scanner(System.in);
        typeofAnimal = input.nextLine();
        System.out.println("What would you like to name it?");
        input = new Scanner(System.in);
        String name = input.nextLine().toUpperCase();

        if (typeofAnimal.equalsIgnoreCase("Robotic Dog")) {
            RoboticDog pet = new RoboticDog(name);
            shelter.put(name, pet);
        }
        if (typeofAnimal.equalsIgnoreCase("Robotic Cat")) {
            RoboticCat pet = new RoboticCat(name);
            shelter.put(name, pet);
        }
        if (typeofAnimal.equalsIgnoreCase("Organic Cat")) {
            OrganicCat pet = new OrganicCat(name);
            shelter.put(name, pet);
        }
        if (typeofAnimal.equalsIgnoreCase("Organic Dog")) {
            OrganicDog pet = new OrganicDog(name);
            shelter.put(name, pet);
        }
        System.out.println("Excellent Choice!");
    }

    public void removeVirtualPet(String petName) {
        shelter.remove(petName);
    }

    public Collection<VirtualPet> retrievePets() {
        return shelter.values();
    }

    public void feedAllPets() {
        for (VirtualPet petsToFeed : shelter.values()) {
            petsToFeed.feed();
        }
    }

    public void hydrateAllPets() {
        for (VirtualPet petsToHydrate : shelter.values()) {
            petsToHydrate.hydrate();
        }
    }

    public void tickAllPets() {
        for (VirtualPet petsToTick : shelter.values()) {
            petsToTick.tick();
        }
    }
    public void maintainAllPets() {
        for (VirtualPet petsToClean : shelter.values()) {
            petsToClean.maintain();
        }
    }


        public void shouldBeAbleToSnuggleOnePet(String petName) {
        for (VirtualPet petToSnuggle : shelter.values()) {
            petToSnuggle = shelter.get(petName);
            petToSnuggle.snuggle();
        }
    }



}
