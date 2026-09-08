package exerciseInClassBoolean1;

public class Rectangle {
    private int width;
    private int hight;

    public Rectangle(int width,int hight) {
        this.width = width;
        this.hight = hight;
    }

    public int calculateArea() {
        return width * hight;
    }

    public int calculatePerimeter() {
        return 2 * ( width + hight );
    }


}
