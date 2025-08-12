package objects;

public class Rectangle {

//    Fields

    private double length;
    private double width;
    private int sides = 4;

//    Constructors

    public Rectangle(){
        setLength(0);
        setWidth(0);
    }

//    Args Constructors

    public Rectangle(double length, double width){
        setLength(length);
        setWidth(width);
    }

//    Behaviour

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea() {
        return length * width;
    }

//    Getter and setter

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
