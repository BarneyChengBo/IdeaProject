package exerciseInClassSwitch1;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String month = scan.nextLine();

        switch (month){
            case "januari":
                System.out.println("Spring");
                break;
            case "februari":
                System.out.println("Spring");
                break;
            case "mars":
                System.out.println("Spring");
                break;
            case "april":
                System.out.println("Sommar");
                break;
            case "maj":
                System.out.println("Sommar");
                break;
            case "juni":
                System.out.println("Sommar");
                break;
            case "juli":
                System.out.println("Höst");
                break;
            case "augusti":
                System.out.println("Höst");
                break;
            case "september":
                System.out.println("Höst");
                break;
            case "oktober":
                System.out.println("Vinter");
                break;
            case "november":
                System.out.println("Vinter");
                break;
            case "december":
                System.out.println("Vinter");
                break;
            default:
                System.out.println("skriva month namn");
                break;


        }

    }
}
