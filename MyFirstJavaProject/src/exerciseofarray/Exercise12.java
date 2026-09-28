package exerciseofarray;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {

        //Skapa ett program som läser in 10 heltal till en array
        Scanner scan = new Scanner(System.in);

        //Skapa en ny tom array med 10 platser

        int[] numbers = new int[10];

        //Läsa in och spara tal i array 10 gånger

        for ( int i = 0 ; i < 10 ; i ++) {
            numbers[i] = scan.nextInt();
        }

        // och sedan skriver ut talen
        int j = 10;

        for ( int i = 0 ; i < 10 ; i ++) {

            System.out.println(numbers[j - 1 - i]);
        }

        //baklänges. Endast en array ska användas.

    }
}
