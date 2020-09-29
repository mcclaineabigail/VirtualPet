package virtual_pet;

import org.junit.jupiter.api.Test;

import javax.naming.Name;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class VirtualPetTest {
    @Test
    public void shouldBeAbleToCreatePet() {
        VirtualPet pet = new RoboticDog("Test Name");
        VirtualPet pet2 = new RoboticCat("Test Name");
        VirtualPet pet3 = new OrganicDog("Test Name");
        VirtualPet pet4 = new OrganicCat("Test Name");
    }


    @Test
    public void petShouldHaveName() {
        VirtualPet underTest = new RoboticDog("Jeff");
        String result = underTest.getPetName();
        assertEquals("Jeff", result);
    }


    @Test
    public void shouldHaveDefaultHunger() {
        VirtualPet underTest = new RoboticCat("Steve");
        int result = underTest.getHunger();
        assertEquals(60, result);
    }


    @Test
    public void shouldHaveDefaultThirst() {
        VirtualPet underTest = new OrganicDog("Betty");
        int result = underTest.getThirst();
        assertEquals(30, result);

    }

    @Test
    public void shouldHaveDefaultSass() {
        VirtualPet underTest = new OrganicCat("Bob");
        int result = underTest.getSass();
        assertEquals(50, result);
    }

    @Test
    public void tickShouldIncreaseHunger() {
        //Arrangement
        VirtualPet pet = new OrganicCat("Kendrick");
        int initialHunger = pet.getHunger();
        //Action
        pet.tick();
        //Assertion
        int hungerAfterTick = pet.getHunger();
        assertEquals(initialHunger + 5, hungerAfterTick);
    }
    @Test
    public void tickShouldIncreaseFuelNeeds() {
        //Arrangement
        VirtualPet pet = new RoboticCat("Kendrick");
        int initialFuelNeed = pet.getHunger();
        //Action
        pet.tick();
        //Assertion
        int hungerAfterTick = pet.getHunger();
        assertEquals(initialFuelNeed + 5, hungerAfterTick);
    }

    @Test
    public void tickShouldIncreaseThirst() {
        //Arrangement
        VirtualPet pet = new OrganicDog("Kendrick");
        int initialThirst = pet.getThirst();
        //Action
        pet.tick();
        //Assertion
        int thirstAfterTick = pet.getThirst();
        assertEquals(initialThirst + 5, thirstAfterTick);
    }

    @Test
    public void tickShouldIncreaseLubeNeeds() {
        //Arrangement
        VirtualPet pet = new RoboticDog("Kendrick");
        int initialLubeNeed = pet.getThirst();
        //Action
        pet.tick();
        //Assertion
        int thirstAfterTick = pet.getThirst();
        assertEquals(initialLubeNeed + 5, thirstAfterTick);
    }

    @Test
    public void tickShouldIncreaseSass() {
        //Arrangement
        VirtualPet pet = new OrganicDog("Kendrick");
        int initialSass = pet.getSass();
        //Action
        pet.tick();
        //Assertion
        int sassAfterTick = pet.getSass();
        assertEquals(initialSass + 10, sassAfterTick);

    }

    @Test
    public void feedShouldLowerHunger() {
        VirtualPet pet = new OrganicCat("Melon");
        int initialHunger = pet.getHunger();
        pet.feed();
        int hungerAfterFeed = pet.getHunger();
        if (hungerAfterFeed >=50) {
            assertEquals(initialHunger - 50, hungerAfterFeed);
        }
        else if (hungerAfterFeed < 50){
            assertEquals(10 , hungerAfterFeed);
        }
    }

    @Test
    public void feedShouldLowerFuelNeeds() {
        VirtualPet pet = new RoboticCat("Melon");
        int initialFuelNeed = pet.getHunger();
        pet.feed();
        int fuelNeedAfterFeed = pet.getHunger();
        if (fuelNeedAfterFeed >=50) {
            assertEquals(initialFuelNeed - 50, fuelNeedAfterFeed);
        }
        else if (fuelNeedAfterFeed < 50){
            assertEquals(10 , fuelNeedAfterFeed);
        }
    }

    @Test
    public void hydrateShouldLowerThirst() {
        VirtualPet pet = new OrganicDog("Fredward");
        int initialThirst = pet.getThirst();
        pet.hydrate();
        int thirstAfterHydrate = pet.getThirst();
        if (thirstAfterHydrate >=30) {
            assertEquals(initialThirst - 30, thirstAfterHydrate);
        }
        else if (thirstAfterHydrate < 30){
            assertEquals(0 , thirstAfterHydrate);
        }
    }

    @Test
    public void hydrateShouldLowerLubeNeeds() {
        VirtualPet pet = new RoboticDog("Fredward");
        int initialLubeNeeds = pet.getThirst();
        pet.hydrate();
        int LubeNeedsAfterHydrate = pet.getThirst();
        if (LubeNeedsAfterHydrate >=30) {
            assertEquals(initialLubeNeeds - 30, LubeNeedsAfterHydrate);
        }
        else if (LubeNeedsAfterHydrate < 30){
            assertEquals(0 , LubeNeedsAfterHydrate);
        }
    }

    @Test
    public void snuggleShouldLowerSass() {
        VirtualPet pet = new RoboticCat("Ted");
        int initialSass = pet.getSass();
        pet.snuggle();
        int sassAfterSnuggle = pet.getSass();
        if (sassAfterSnuggle >=50) {
            assertEquals(initialSass - 50, sassAfterSnuggle);
        }
        else if (sassAfterSnuggle < 50){
            assertEquals(0 , sassAfterSnuggle);
        }
    }

    @Test
    public void hungerAlwaysPositive() {
        VirtualPet pet = new OrganicDog("Ted");
        int hungerAfterFeeding = pet.getHunger();
        assertTrue(hungerAfterFeeding >= 0);
    }
    @Test
    public void thirstAlwaysPositive() {
        VirtualPet pet = new OrganicCat("Molly");
        int thirstAfterHydrate = pet.getThirst();
        assertTrue(thirstAfterHydrate >= 0);

    }

    @Test
    public void sassAlwaysPositive(){
        VirtualPet pet = new RoboticCat("Rocket");
        int sassAfterSnuggle = pet.getSass();
        assertTrue(sassAfterSnuggle >=  0);
    }



}



