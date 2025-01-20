/*Write a program to perform following operations on double values. Maximum from two double values (input from user).*/

import java.util.Scanner;
public class Maxdouble{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter First value:- ");
        double num1 = sc.nextDouble();

        System.out.print("Enter Second value:- ");
        double num2 = sc.nextDouble();

        double Max= Math.max(num1, num2);

        System.out.print("Maximum value between " + num1+ " & " +num2+ " is:- "+Max);
    }
}