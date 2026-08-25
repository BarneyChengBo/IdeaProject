package exercise11;

public class Exercise {

    public static void main(String[] args) {
        //String names[] = {"Amanda", "Beatrice", "Caesar", "David", "Elin"};

        String[] names = new String[5];

        names[0] = "Amanda";
        names[1] = "Beatrice";
        names[2] = "Caesar";
        names[3] = "David";
        names[4] = "Elin";

        for(int i = 0; i<5; i++) {
            System.out.println(names[i]);
        }


        //System.out.println(names[0]);
        //System.out.println(names[4]);

        String myString = "hej på dig";
        String[] stringArray = myString.split(" ");

        for(int i = 0; i<3; i++) {
            System.out.println(stringArray[i]);
        }




    }

}
