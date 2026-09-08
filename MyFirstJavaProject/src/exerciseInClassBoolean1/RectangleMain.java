package exerciseInClassBoolean1;

public class RectangleMain {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(23,10);

        int Area = rectangleOne.calculateArea();
        int Perimeter = rectangleOne.calculatePerimeter();

        System.out.println(Area);
        System.out.println(Perimeter);


    }
}
