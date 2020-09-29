package virtual_pet;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PetShelterTest {
    @Test
    public void shouldBeAbleToAddPet(){
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new OrganicDog("Doink");
        underTest.addPet(testPet);
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(1)
                        .contains(testPet);
    }
    @Test
    public void shouldBeAbleToRemoveAPet(){
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new OrganicDog("BoneSaw");
        underTest.addPet(testPet);
        underTest.removeVirtualPet(testPet.getPetName());
        Collection<VirtualPet> pets = underTest.retrievePets();
        assertThat(pets).hasSize(0)
                        .isEmpty();
    }
    @Test
    public void shouldBeAbleToFeedAllPets(){
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new OrganicDog("THE Rock");
        VirtualPet anotherTestPet = new RoboticCat("Cactus Jack");
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);
        underTest.feedAllPets();
        assertThat(testPet.getHunger()).isEqualTo(10);
        assertThat(anotherTestPet.getHunger()).isEqualTo(10);

    }
    @Test
    public void shouldBeAbleToHydrateAllPets(){
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new OrganicCat("HeadBanger");
        VirtualPet anotherTestPet = new RoboticDog("Gangrel");
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);
        underTest.hydrateAllPets();
        assertThat(testPet.getThirst()).isEqualTo(0);
        assertThat(anotherTestPet.getThirst()).isEqualTo(0);
    }

    @Test
    public void shouldBeAbleToSnuggleOnePet(){
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new OrganicCat("Jericho");
        underTest.addPet(testPet);
        underTest.shouldBeAbleToSnuggleOnePet(testPet.getPetName());
        assertThat(testPet.getSass()).isEqualTo(0);
    }
    @Test
    public void shouldBeAbleToTickAllPets() {
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new RoboticDog("HeadBanger");
        VirtualPet anotherTestPet = new OrganicDog("Gangrel");
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);
        underTest.tickAllPets();
        assertThat(testPet.getThirst()).isEqualTo(35);
        assertThat(anotherTestPet.getHunger()).isEqualTo(65);
    }

    @Test
    public void shouldBeAbleToMaintainAllPets(){
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new OrganicCat("HeadBanger");
        VirtualPet anotherTestPet = new RoboticDog("Gangrel");
        underTest.addPet(testPet);
        underTest.addPet(anotherTestPet);
        underTest.maintainAllPets();
        assertThat(testPet.getDirt()).isEqualTo(0);
        assertThat(anotherTestPet.getDirt()).isEqualTo(0);
    }

    @Test
    public void shouldBeAbleToWalkAllDogs() {
        PetShelter underTest = new PetShelter();
        VirtualPet testPet = new OrganicDog("HeadBanger");
        underTest.addPet(testPet);
        if (testPet instanceof Walkable) {
            //type animal.fly  (called casting)
            ((Walkable) testPet).walk();
        }
        assertThat(testPet.getSass()).isEqualTo(20);
    }


    }








