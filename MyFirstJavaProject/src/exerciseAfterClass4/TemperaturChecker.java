package exerciseAfterClass4;

public class TemperaturChecker {

    public String checkTemperature(int temp) {
        if ( temp > 25 ) {
            return "För varmt";
        } else if ( temp < 18) {
            return "För kallt";
        } else {
            return "Lagom temp";
        }



    }



}
