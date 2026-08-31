package VeckouppgiftVecka2;

public class HousePetTest {
    public static void main() {


        HousePetClass Dog = new HousePetClass("Wangcai",30,60,80);



        for( int i = 0 ; i < 7 ; i ++  ) {
            Dog.hunger += 5;
            Dog.energy -= 3;
            int wellBeing = Dog.energy + Dog.happiness - Dog.hunger;

            System.out.println("This is day " + (i + 1) );
            Dog.getPetInfo();
            System.out.println("Well-being is " + wellBeing);

            if ( Dog.hunger > 50 ) {
                System.out.println(" Wangcai is hungry !");
            }

            if ( Dog.energy < 50 ) {
                System.out.println(" Wangcai is tired !");
            }



        }


    }
}
