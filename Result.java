public class Result {
    public static void main(String[] args) {

        // Rectangle test
        int width = 5, length = 7;
        Figure Rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nResulting area: " + Rectangle.area()
                + "\nResulting perimeter: " + Rectangle.perimeter() + "\n");

        // Circle test
        int radius = 5;
        Figure Circle =  new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nResulting Area: " + Circle.area()
            + "\nResulting Perimeter: " + Circle.perimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        Figure Triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nResulting Area: " + Triangle.area()
                + "\nResulting Perimeter: " + Triangle.perimeter() + "\n");
    }
}