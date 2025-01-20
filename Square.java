/*Write a program to calculate area and perimeter of square. side should be initialized with fixed value.*/
public class Square{
    public static void main(String[] args)
    {
      int side =5;
      int area= side * side;
      int perimeter= 4 * side;
      
      System.out.println("\nSide of the Square:- "+ side);
      System.out.println("Area of the Square:- "+ area);
      System.out.println("Perimeter of Square:- "+ perimeter);

    }
}