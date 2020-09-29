package virtual_pet;

public class OrganicDog extends OrganicPets implements Walkable{

    public OrganicDog(String petName) {
        super(petName);
    }

    public void walk(){
        sass = sass - 30;
    }

}
