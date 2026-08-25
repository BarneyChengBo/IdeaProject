package exercise2;

import java.util.Scanner;
public class IfStatements {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        if( number1 > number2 ) {
            System.out.println("number1 is larger than number2");

        } else if(number1 < number2)        {
            System.out.println("number1 is smaller than number2");
        }    else {
            System.out.println("number1 is the same as number2");
        }

        System.out.println("end of text");


    }
}
