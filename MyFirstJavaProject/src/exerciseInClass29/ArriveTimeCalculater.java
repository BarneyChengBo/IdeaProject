package exerciseInClass29;

public class ArriveTimeCalculater {
    public static void main(String[] args) {
        int depHour = 14;
        int depMinute = 25;

        int driveHour = 5;
        int driveMinute = 45;

        int arriveHour = depHour + driveHour;
        int arriveMinute = depMinute + driveMinute;

        if ( arriveMinute >= 60 ) {
            arriveMinute -= 60;
            arriveHour += 1;
        }



        if ( arriveHour >= 24 ) {
            arriveHour -= 24;
            System.out.println("NÄSTA DAG");
        }

        System.out.println("Arrive time will be " + arriveHour + ":" + arriveMinute +".");


    }
}
