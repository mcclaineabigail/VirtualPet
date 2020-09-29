package virtual_pet;

public class RoboticDog extends RoboticPets implements Walkable {

    public RoboticDog(String petName) {
        super(petName);
    }

    public void walk() {
        sass = sass - 30;
        lubeNeeds = lubeNeeds +20;
    }


}
