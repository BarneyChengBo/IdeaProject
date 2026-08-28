package exerciseInClass42;

public class Multiplikationstabellen {

    public static void main(String[] args) {

        for( int e = 1; e <= 9; e++) {
            System.out.println("Here comes number " + e);
            for( int i = 1; i <= 9; i++) {

                int product = e * i;
                System.out.println( e + " * " + i + " = " + product);
            }
        }



    }





}
