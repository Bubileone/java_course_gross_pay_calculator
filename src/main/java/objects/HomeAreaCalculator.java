package objects;

public class HomeAreaCalculator {

    public static void main(String[] args){

//Instantiating Objects:
//        1. Using first type of Constructor
        Rectangle room1 = new Rectangle();
        room1.setLength(50);
        room1.setWidth(25);
        double areaOfRoom1 = room1.calculateArea();

//        2. Using second type of Constructor
        Rectangle room2 = new Rectangle(30, 75);
        double areaOfRoom2 = room2.calculateArea();

        double totalArea = areaOfRoom1 + areaOfRoom2;
        System.out.println("Area of both rooms: " + totalArea);

    }
}
