package virtual_pet;


public abstract class VirtualPet {

    private String petName;
    protected int hunger = 60;
    protected int thirst = 30;
    protected int sass = 50;
    protected int dirt = 10;

    public VirtualPet(String petName) {
        this.petName = petName;
    }

    public String status(){
        return petName + " - Hunger: " + hunger + " | Thirst: " + thirst + " | Sass: " + sass;
    }


    @Override
    public String toString() {
        return petName;
    }

    //getPetName stays the same
    public String getPetName() {
        return petName;
    }


    public int getHunger() {
        if (hunger < 0) {
            hunger = 0;
        }

        return hunger;
    }


    public int getThirst() {
        if (thirst < 0) {
            thirst = 0;
        }
        return thirst;
    }

    public int getSass() {
        if (sass < 0) {
            sass = 0;
        }
        return sass;
    }

    public int getDirt() {
        if (dirt < 0) {
            dirt = 0;
        }
        return dirt;
    }

    public void tick() {
        if (hunger < 0) {
            hunger = 0;
        }

        if (thirst < 0) {
            thirst = 0;
        }

        if (sass < 0) {
            sass = 0;
        }
        if (dirt < 0){
            dirt=0;
        }

        hunger = hunger + 5;
        thirst = thirst + 5;
        sass = sass + 10;
        dirt = dirt + 10;


        if (hunger >= 90) {
            System.out.println("Hunger Alert!!!");
        }
        if (thirst >= 90) {
            System.out.println("Thirst Alert!!!");
        }
        if (sass >= 90) {
            System.out.println("Sass Alert!!!");
        }


    }

    public void feed() {
        hunger = hunger - 50;
        thirst = thirst + 5;
        sass = sass - 5;
    }


    public void hydrate() {
        hunger = hunger + 5;
        thirst = thirst - 50;
        sass = sass - 5;
    }


    public void snuggle() {
        hunger = hunger + 5;
        thirst = thirst + 5;
        sass = sass - 50;
    }

    public void maintain() {
        dirt = dirt-100;
        sass = sass -30;

    }


}







