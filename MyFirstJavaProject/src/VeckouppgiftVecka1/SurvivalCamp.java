package VeckouppgiftVecka1;

public class SurvivalCamp {
    public static void main(String[] args) {

        int energy = 100;
        int water = 60;
        int food = 60;

        for ( int i = 0; i < 10 ; i ++) {

            System.out.println( "The day " + (i+1) + ", the man has energy " + energy);
            System.out.println( "And he has food " + food + ", and water " + water + ".");

            energy = energy - 10 ;


            if ( water > 8 ) {
                water = water - 8;
                energy = energy + 2;
            } else {
                water = 0;
                energy = energy - 2;
            }
            if ( food > 8 ){
                food = food - 8;
                energy = energy + 2;
            } else {
                food = 0;
                energy = energy - 2;
            }

            if (energy <= 0) {
                System.out.println("He can not survival in 10 days.");
                break;
            }


        }


    }
}
