package exercise2;
import java.util.Scanner;
public class Exercise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Jämför två tal. Om det första är större än det andra skriv ut ”Första talet är störst”, samt ”Andra talet är störst” om det är tvärt om
        System.out.println("Skriv det första talet:");
        int number1 = input.nextInt();
        System.out.println("Skriv det andra talet:");
        int number2 = input.nextInt();

        if (number1 > number2) {
            System.out.println("Första talet är störst");
        }
        if (number2 > number1) {
            System.out.println("Andra talet är störst");
        }



        //Jämför två tal. Om det första är jämt delbart med det andra skriv ut ”Jämt delbart”, annars skriv ut ”Inte jämt delbart”

        if ( number1%number2 == 0 ) {
            System.out.println("Jämt delbart");
        } else {
            System.out.println("Inte jämt delbart");
        }

    }
}
