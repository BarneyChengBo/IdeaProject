package exerciseInClass42;

public class SavingMoneyOver1M {

    //För första dagen erbjuds han 1 öre, för andra dagen 2 öre, för tredje dagen 4 öre osv.
    //
    //
    //
    // Lönen

    //fördubblas alltså varje dag.
    //
    // Skapa ett program som beräknar hur många dagar mannen

    //måste arbeta för att tjäna en miljon kronor.
    public static void main(String[] args) {
        int d = 0;
        double s = 1;

        double total = 0;



        while ( total <  1000000 ) {
            d ++;
            total = total + s;
            s = s * 2;


        }

        System.out.println("When the man has worked " + d + " days, he will earn money more than 1 million.");
        System.out.println("The total amount of money he earned was " + total );
    }






}
