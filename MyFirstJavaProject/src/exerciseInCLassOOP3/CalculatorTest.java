package exerciseInCLassOOP3;

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Write the first number:");
        int num1 = scan.nextInt();
        System.out.println("Write the second number:");
        int num2 = scan.nextInt();
        System.out.println("Write the first number:");
        int num3 = scan.nextInt();
        System.out.println("Write the second number:");
        int num4 = scan.nextInt();

        Calculator calcu = new Calculator(num1,num2);
        Calculator calcu2 = new Calculator(num3,num4);

        System.out.println("The sum of these two is "+ calcu.sumOfTwo());

        System.out.println("The product of these two is "+ calcu.productOfTwo());

        System.out.println("The devision between these two is " + calcu.devision());

        System.out.println("the difference between these two is " + calcu.difference());

        System.out.println();

        System.out.println("The sum of these two is "+ calcu2.sumOfTwo());

        System.out.println("The product of these two is "+ calcu2.productOfTwo());

        System.out.println("The devision between these two is " + calcu2.devision());

        System.out.println("the difference between these two is " + calcu2.difference());





    }
}
