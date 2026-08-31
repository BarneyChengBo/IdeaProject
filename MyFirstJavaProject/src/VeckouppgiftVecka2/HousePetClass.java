package VeckouppgiftVecka2;

public class HousePetClass {
    public String name;
    public int hunger;
    public int energy;
    public int happiness;


    public HousePetClass(String petName, int petHunger, int petEnergy, int petHappiness) {
        name = petName;
        hunger = petHunger;
        energy = petEnergy;
        happiness = petHappiness;

    }

    public void getPetInfo() {
        System.out.println("This house pet is a " + name + ". ");
        System.out.println("Its hunger value is " + hunger + ", its energy value is " + energy + " ,and its happiness is " + happiness);

    }

}
