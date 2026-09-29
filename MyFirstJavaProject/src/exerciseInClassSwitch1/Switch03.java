package exerciseInClassSwitch1;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        //Skapa en enkel kalkylator som tar emot två tal
        Scanner scan = new Scanner(System.in);

        int[] twoValue = new int[2];

        int number1 = scan.nextInt();
        int number2 = scan.nextInt();
        scan.nextLine();
        String operation = scan.nextLine();

        switch (operation) {
            case "+":
                System.out.println(number1 + number2);
                break;
            case "-":
                System.out.println(number1 - number2);
                break;
            case "*":
                System.out.println(number1 * number2);
                break;
            case "/":
                System.out.println(number1 / number2);
                break;
            // Läs in + - * / (add, sub, mul, div)
            // från användaren. Använd en switch-sats för att bestämma vilken operation som ska utföras baserat på användarens input.
            //Switchsats där operation bestämmer vilken kod som ska köras
            //För varje operation skriv ut resultatet av uträkningen
        }
    }
}
