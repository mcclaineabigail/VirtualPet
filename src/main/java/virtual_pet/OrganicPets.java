package virtual_pet;

public abstract class OrganicPets extends VirtualPet {

    private String petName;


    public OrganicPets(String petName) {
        super(petName);
        this.petName=petName;
    }


    @Override
    public String status() {
        return petName + " - Hunger: " + hunger + " | Thirst: " + thirst + " | Sass: " + sass + " | Cleaning Need: " + dirt;
    }




}



