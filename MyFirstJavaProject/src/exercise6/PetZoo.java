package exercise6;

public class PetZoo {

    public static void main(String[] args) {
        Pet dog = new Pet("Jiwawa");
        Pet cat = new Pet( "Sphenks");
        Pet rabbit = new Pet ( "Koko");

        //dog.namePrinter();
        //cat.namePrinter();
        //rabbit.namePrinter();

        String dogName = dog.getPetName();
        String catName = cat.getPetName();
        String rabbitName = rabbit.getPetName();



        for(int i=0; i<2; i++) {
            System.out.println( "This is a pet called "+ dogName);
            System.out.println( "This is a pet called "+ catName);
            System.out.println( "This is a pet called "+ rabbitName);
        }




    }




}
