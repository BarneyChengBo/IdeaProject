package exerciseInClass1;

public class TimeCalculator {
    public static void main(String[] args) {
        int hour = 2;
        int minute = hour * 60;
        int second = hour * 3600;
        System.out.printf("The result is " + minute + " minutes.");
        System.out.printf("and it equals " + second + " seconds.");
    }
}
