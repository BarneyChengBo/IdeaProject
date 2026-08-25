package exercise4;

public class ForLoop {

    public static void main(String[] args) {

        //Skriv ut alla tal ifrån 1-100

        for(int i=0; i<100; i++ ){
            System.out.print( ( i+1) + " ");
        }

        //Skriv ut alla jämna tal ifrån 1-100

        System.out.println();
        for(int i=0; i<100; i += 2 ){
            System.out.print( ( i+2) + " ");
        }


        /*Skriv ut alla fibonnacci-tal ifrån 1-100.
        Fibonnacci-tal är de två senaste talen adderat och börjar med 1, 1 som första två tal.
        Exempel: 1, 1, 2, 3, 5, 8, 13, 21…
        */

        System.out.println();

        int numberA = 1 ;
        int numberB = 1 ;

        for(int i = 0; i <= 10; i++){
            System.out.print( numberA + " ");

            int numberC = numberB + numberA;
            numberA = numberB;
            numberB = numberC;

        }



    }

}
