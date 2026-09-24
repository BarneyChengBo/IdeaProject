package exerciseInClassTDD1;

import java.util.Scanner;

public class WebShop {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ditt användarnam och lösenord");

        String userName = scan.nextLine();;
        String passWord = scan.nextLine();;
        User userA = new User(userName,passWord);



        System.out.println("Ditt nya användarnam och lösenord");

        String newUserName = scan.nextLine();
        userA.setUserName(newUserName);

        String newPassword = scan.nextLine();
        userA.setPassword(newPassword);

        System.out.println("Ditt nya användarnam är " + userA.getUserName());
        System.out.println("Ditt nya lösenord är " + userA.getPassword());





    }
}
