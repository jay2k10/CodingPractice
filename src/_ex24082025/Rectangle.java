package _ex24082025;

public class Rectangle {
    public int length;
    public int breadth;
    /*
    public
    protected
    default
    private
     */

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;

    }

    public void draw() {
        System.out.println("Draw rectangle");
    }

    public void area() {
        System.out.println("Area of rectangle is: " + (length * breadth));
    }
}
