import java.util.Scanner;

class Triangle {
    
    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle() {
        this.side1 = 0;
        this.side2 = 0;
        this.side3 = 0;
    }

     public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

      public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

     public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side 1: ");
        this.side1 = sc.nextDouble();
        System.out.print("Enter side 2: ");
        this.side2 = sc.nextDouble();
        System.out.print("Enter side 3: ");
        this.side3 = sc.nextDouble();
    }

    public void display() {
        System.out.println("Sides of the triangle: " + side1 + ", " + side2 + ", " + side3);
        if (isValid()) {
            System.out.println("Perimeter: " + calcPeri());
        } else {
            System.out.println("This is not a valid triangle.");
        }
    }

    public double calcPeri() {
        return side1 + side2 + side3;
    }

    public boolean isValid() {
        return (side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1);
    }
}

public class TriangleTest {
    public static void main(String[] args) {
        Triangle[] triangles = new Triangle[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Triangle " + (i + 1) + ":");
            triangles[i] = new Triangle();
            triangles[i].accept();
        }

        System.out.println("\nValid Triangles and their Perimeters: ");
        for (int i = 0; i < 4; i++) {
            System.out.println("\nTriangle " + (i + 1) + ":");
            triangles[i].display();
        }
    }
}
