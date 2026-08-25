package exercise1;
import java.util.Scanner;
public class Exercise {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Skriv det första talet:");
        int firstNumber = input.nextInt();
        System.out.println("Skriv det andra talet:");
        int secondNumber = input.nextInt();
        System.out.println("Skriv det tredje talet:");
        int thirdNumber = input.nextInt();

        int sumNumber = firstNumber + secondNumber + thirdNumber;
        double avrNumber = sumNumber/3.0;

        System.out.println("The sum of the three numbers is " + sumNumber );
        System.out.println("and the average of them is " + avrNumber );






    }
}
