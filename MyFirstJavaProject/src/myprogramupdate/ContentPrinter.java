package myprogramupdate;

import myprogram.CharRowChecker;

import java.util.Scanner;

public class ContentPrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Den här variabeln är till för att hålla while-loopen köra. Om det blir false, ska loopen sluta.

        //Jag har skapat ett nytt objekt som hetter "checker" från klassen CharRowChecher.
        CharRowWordChecker checker = new CharRowWordChecker();

        // Maximalt antal rader är 10 här, och vi kan öka det vid behov.
        String[] myInput = new String[10];
        boolean run = true;
        int n = 0;
        int charSum = 0;
        int rowSum = 0;
        int wordSum = 0;
        String longWord = "";


        System.out.println("Tryck Enter för att gå till nästa rad, ");
        System.out.println("och skriv \"stop\" för att avsluta programmet: ");


        while (run) {

            String text = scan.nextLine();

            myInput[n] = text;
            n++;
            charSum = checker.getChar(myInput);
            rowSum = checker.getRow(myInput);
            wordSum = checker.getWord(myInput);
            longWord = checker.getLongestWord(myInput);
            run = checker.detectStop(myInput);


        }


        System.out.println( "Total antal tecken : " + (charSum - 4) );
        System.out.println( "Total antal rader : " + (rowSum - 1) );
        System.out.println( "Total antal ord : " + (wordSum - 1) );
        System.out.println( "Det längsta ordet : " + longWord   );

    }
}
