package exerciseInClassOOP2;

public class Dog {
    private String name;
    private String breed;
    private int age;

    public Dog(String dogName,String dogBreed, int dogAge) {
        name = dogName;
        breed = dogBreed;
        age = dogAge;
    }

    public void bark(){
        System.out.println("Voff!");
    }

    public void getHumanAge() {
        System.out.println( "This dog is equivalent to "+ age * 7 + " years old in human years.");
    }

    /*public int getHumanAge() {
        return age * 7;
    }*/

    /*

    public void setAge(int newAge) { age = newAge; }
    public int getAge() { no usages
        return age;


    */



}
