package exercise7;

import java.util.Scanner;

public class StringManager {

    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);

        String myString = scan.nextLine();


        if(myString.equals("ägg")) {

            System.out.println("ägg är knasigt");
        }
        else{

            for(int i=0; i< myString.length(); i++) {
                System.out.print(myString.charAt(i) + " ");
            }

        }












    }

}
