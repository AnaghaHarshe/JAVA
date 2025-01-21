import java.util.Scanner;
public class MaxDouble {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number:- ");
        double num1 = sc.nextDouble();

        System.out.print("Enter 2nd Number:- ");
        double num2 = sc.nextDouble();

        double maximum = Math.max(num1, num2);
        double minimum = Math.min(num1, num2);

        System.out.println("Maximum number between "+num1+ " and "+num2+ " is " +maximum);
        System.out.println("Minimum number between "+num1+ " and "+num2+ " is " +minimum);
    }
}
