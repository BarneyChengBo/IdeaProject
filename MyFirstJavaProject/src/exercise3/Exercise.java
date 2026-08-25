package exercise3;

public class Exercise {
    static void main(String[] args) {

    //Skriv ut alla tal ifrån 1-100

    System.out.println( "Numbers 1-100 :");
    int number = 1 ;
    while (number <= 100) {
        System.out.print(number + " ");
        number++;
    }

    //Skriv ut alla jämna tal ifrån 1-100
    System.out.println();
    System.out.println();
    System.out.println( "Even numbers 1-100 :");
    int even = 2 ;
    while (even <= 100) {
        System.out.print(even + " ");
        even += 2;
    }


    /*Skriv ut alla fibonnacci-tal ifrån 1-100.
     Fibonnacci-tal är de två senaste talen adderat och börjar med 1, 1 som första två tal.
      Exempel: 1, 1, 2, 3, 5, 8, 13, 21…
     */

    System.out.println( "Fibonacci numbers 1-100 :");
    int numberA = 1 ;
    int numberB = 1 ;

    while ( numberA <= 100 ) {

        System.out.print( numberA + " ");

        int numberC = numberB + numberA;
        numberA = numberB;
        numberB = numberC;

    }






    }
}
