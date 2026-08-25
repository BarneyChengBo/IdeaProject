package exercise1;

public class MyInteger {
    static void main(String[] args) {
        int number = 5;
        int nextNumber = 6;
        System.out.println(number);
        System.out.println(nextNumber);

        number = 5 + 3;
        nextNumber = number + 1;
        System.out.println(number);
        System.out.println(nextNumber);
        number += 3;
        nextNumber++;
        System.out.println(number);
        System.out.println(nextNumber);
        number -= 5;
        nextNumber--;
        System.out.println(number);
        System.out.println(nextNumber);

    }
}
