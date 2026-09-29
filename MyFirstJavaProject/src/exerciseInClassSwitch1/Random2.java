package exerciseInClassSwitch1;

import java.util.Scanner;

public class Random2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // define the range
        int min = 1;
        int max = 100;
        int range = max - min + 1;
        int rand = (int) (Math.random() * range) + min;
        boolean run = true;

        while(run) {
            int guessNumber = scan.nextInt();
            if(guessNumber == rand){
                System.out.println("You are correct");
                break;
            }else if (guessNumber > rand) {
                System.out.println("Too big");
            }else if (guessNumber < rand) {
                System.out.println("Too small");
            }
        }






    }
}
