package exerciseInClassBoolean2;

public class CircleMain {
    public static void main(String[] args) {
        Circle circleOne = new Circle(0.5);

        System.out.println(circleOne.calculateArea());
        System.out.println(circleOne.calculateCircumference());

        if (circleOne.hasSmallArea()) {
            System.out.println("The area is smaller than the perimeter.");
        } else {
            System.out.println("The area is bigger than the perimeter.");
        }

    }
}
