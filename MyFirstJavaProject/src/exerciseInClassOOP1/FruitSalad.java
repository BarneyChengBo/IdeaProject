package exerciseInClassOOP1;

public class FruitSalad {
    public static void main(String[] args) {


    /*
        Fruit apple = new Fruit("red",30);
        Fruit banana = new Fruit("yellow",-60);
        Fruit kiwi = new Fruit("green",80);



        System.out.println(apple.getColor());
        System.out.println(apple.getWeight());
        System.out.println(banana.getColor());
        System.out.println(banana.getWeight());
    */

        //Definition av att skapa objekt
        //dataTyp variabelNamn = new konstruktor();
        //KlassNamn variabelNamn = new KlassNamn();
        Fruit apple = new Fruit();

        //Definition av att skapa objekt med parameter
        //dataTyp variabelNamn = new konstruktor(parameterVärde);
        //KlassNamn variabelNamn = new KlassNamn(värde);

        Fruit melon = new Fruit("green");
        Fruit banana = new Fruit("yellow");

        banana.print();
        banana.print();
        apple.print();
        melon.print();
        banana.print();

    }




    }

