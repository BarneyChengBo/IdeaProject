package exerciseInClassSwitch1;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day){
            case 1:
                System.out.println("Måndag");
                break;

            case 2:
                System.out.println("Tisdag");
                break;
            case 3:
                System.out.println("Onsdag");
                break;
            case 4:
                System.out.println("Torsdag");
                break;
            case 5:
                System.out.println("Fredag");
                break;
            case 6:
                System.out.println("Lördag");
                break;
            case 7:
                System.out.println("Söndag");
                break;
            default:
                System.out.println("Please write a number from 1 to 7");
                break;
        }

    }
    //Skapa ett program där användaren matar in en siffra (1-7)
    //Scanner
    //Spara ett tal i en variabel som kommer ifrån Scanner
    // och programmet använder en switch-sats för att skriva ut
    // motsvarande dag i veckan (1 är Måndag, 2 är Tisdag, etc.).
    //beroende på det sparade värdet
    //Vid värdet 1 - Måndag
    //2 - Tisdag
    //..
    //7 - Söndag
    //default - Talet motsvarar ingen dag i veckan
}
