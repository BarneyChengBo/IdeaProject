package exerciseInClassOOP1;

public class Fruit {

    /*
    private String color = "";
    private int weight = 0;


    public Fruit(String fruitColor, int fruitWeight){
        color = fruitColor;

        if (fruitWeight>0){
            weight = fruitWeight;
        } else {
            System.out.println("Negative weight value!");
        }

    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }
    */


    private String color;

    //definition av en konstruktor
    //public klassNamn() {
    //}
    public Fruit() {
        color = "red";
    }

    public Fruit(String myColor) {
        color = myColor;
    }

    //Metod som inte returnerar något (bara gör saker)
    //public void metodNamn() {
    //}
    public void print() {
        System.out.println("Fruktens färg är: " +color);
    }





}
