package exercise6;

public class Pet {

    private String name;    // attribute

    public Pet(String petName) { //konstruktor
        name = petName;
    }

    /*public void namePrinter() {
        System.out.println("This pet is " + name );
    }*/

    public String getPetName(){
        return name;
    }


}
