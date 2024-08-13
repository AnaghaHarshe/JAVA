/*using java  Create a class Circle that encapsulates the properties of a circle.
The class should have a private field for the radius, a constructor to initialize the radius, and methods to calculate the area and circumference of the circle.
NOTE: use Math.PI for PI calculations (DO NOT USE 22/7)
 
Guideline to Solve:
§ Define the Circle class with attributes and constructors.
§ Use the this keyword in the parameterized constructor.
§ Define a getArea() funtion that returns the area of there Circle (use Math.PI)
§ Define a getCircumference() funtion that returns the circumference of there Circle (use Math.PI)*/
import java.util.Scanner;

public class Circle {

    private double radius;

    public Circle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative.");
        }
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }
}

public class Circle_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = scanner.nextDouble();

        // Create circle object with input validation
        Circle circle;
        try {
            circle = new Circle(radius);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
            System.exit(1); // Exit program with an error code
            return; // Unreachable but added for clarity
        }

        // Calculate and print area
        double area = circle.getArea();
        System.out.printf("Area: %.2f\n", area);

        // Calculate and print circumference
        double circumference = circle.getCircumference();
        System.out.printf("Circumference: %.2f", circumference);

        scanner.close();
    }
}
