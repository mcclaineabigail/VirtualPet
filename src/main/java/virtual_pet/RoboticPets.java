package virtual_pet;

public abstract class RoboticPets extends VirtualPet {

    protected String petName;
    protected int fuelNeeds = 60; // int hunger
    protected int lubeNeeds = 30; // int thirst
    protected int sass = 50;
    protected int maintenance = 10;

    @Override
    public int getSass() {
        if (sass < 0) {
            sass = 0;
        }
        return sass;
    }

    public RoboticPets(String petName) {
        super(petName);
        this.petName=petName;
    }

    @Override
    public String status() {
        return petName + " - Fuel Needs: " + fuelNeeds + " | Lube Needs: " + lubeNeeds + " | Sass: " + sass + " | Maintenance Needs: " + maintenance;
    }

    @Override
    public int getHunger() {
        if (fuelNeeds < 0){
            fuelNeeds = 0;
        }
        return fuelNeeds;
    }

    @Override
    public int getThirst() {
        if(lubeNeeds < 0){
            lubeNeeds = 0;
        }
        return lubeNeeds;
    }

    @Override
    public int getDirt() {
        return maintenance;
    }

    @Override
    public void tick() {
        if (fuelNeeds < 0) {
            fuelNeeds = 0;
        }

        if (lubeNeeds < 0) {
            lubeNeeds = 0;
        }

        if (sass < 0) {
            sass = 0;
        }
        if (maintenance<0){
            maintenance=0;
        }

        fuelNeeds = fuelNeeds + 5;
        lubeNeeds = lubeNeeds + 5;
        sass = sass + 10;
        maintenance = maintenance + 10;

        if (fuelNeeds >= 90) {
            System.out.println("Hunger Alert!!!");
        }
        if (lubeNeeds >= 90) {
            System.out.println("Thirst Alert!!!");
        }
        if (sass >= 90) {
            System.out.println("Sass Alert!!!");
        }
    }

    @Override
    public void feed() {
        fuelNeeds = fuelNeeds - 50;
        lubeNeeds = lubeNeeds + 5;
        sass = sass - 5;
    }

    @Override
    public void hydrate() {
        fuelNeeds = fuelNeeds + 5;
        lubeNeeds = lubeNeeds - 50;
        sass = sass - 5;
    }

    @Override
    public void snuggle() {
        fuelNeeds = fuelNeeds + 5;
        lubeNeeds = lubeNeeds + 5;
        sass = sass - 50;
    }

    @Override
    public void maintain() {
        maintenance = maintenance -100;
        sass = sass -30;
        if (maintenance<0){
            maintenance=0;
        }

    }
}

