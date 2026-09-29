package exerciseInClassSwitch1;

import java.util.Scanner;

public class Random1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // define the range
        int min = 1;
        int max = Integer.parseInt(scan.nextLine());
        int range = max - min + 1;

// generate random numbers from min to max
        int rand = (int) (Math.random() * range) + min;

        System.out.println(rand);


    }
}
