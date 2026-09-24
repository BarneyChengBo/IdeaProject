package exerciseInClassBoolean2;

public class Circle {
    private double radien;
    double pi = 3.14;

    public Circle(double radien){
        this.radien = radien;
    }

    public double calculateArea() {
        return pi * radien * radien;
    }

    public double calculateCircumference() {
        return  2 * pi * radien;
    }

    public boolean hasSmallArea() {
        if ( calculateArea() < calculateCircumference() ){
            return true;
        } else {
            return false;
        }
    }



}
