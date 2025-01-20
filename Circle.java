/* write a program to calculate area and circumference of circle. Radius should be initialize with fix value.  */

public class Circle
{
    public static void main(String[] args) {

    double radius= 7.0;
    double area = Math.PI * radius * radius ;
    double circumference = 2 * Math.PI * radius;

    System.out.println("\nRadius of Circle:- "+radius);
    System.out.println("Area of Circle:- " +area);
    System.out.println("Circumference of Circle:- "+circumference);
}

}