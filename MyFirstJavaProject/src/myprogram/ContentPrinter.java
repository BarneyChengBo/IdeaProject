package myprogram;

import java.util.Scanner;

public class ContentPrinter {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Den här variabeln är till för att hålla while-loopen köra. Om det blir false, ska loopen sluta.
        boolean run = true;
        //Jag har skapat ett nytt objekt som hetter "checker" från klassen CharRowChecher.
        CharRowChecker checker = new CharRowChecker();
        // Maximalt antal rader är 10 här, och vi kan öka det vid behov.
        String[] myInput = new String[10];
        int n = 0;
        int charSum = 0;
        int rowSum = 0;


        System.out.println("Tryck Enter för att gå till nästa rad, ");
        System.out.println("och skriv \"stop\" för att avsluta programmet: ");


        while (run) {

            String text = scan.nextLine();

            if(text.equals("stop")){
                run = false;
                break;
            }

            myInput[n] = text;
            n++;
            charSum = checker.getChar(myInput);
            rowSum = checker.getRow(myInput);

        }


        System.out.println( "Total antal tecken : " + charSum  );
        System.out.println( "Total antal rader : " + rowSum   );

    }

}
