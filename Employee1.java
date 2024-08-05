import java.util.Scanner;

public class Employee1 {

    String fname;
    String lname;
    double monthlySalary;

    public Employee1(String fname, String lname, double monthlySalary) {
        this.fname = fname;
        this.lname = lname;
        this.monthlySalary = monthlySalary;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public void raiseMonthlySalary() {
        this.monthlySalary = this.monthlySalary * 1.10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Employee details
        System.out.print("Enter fname: ");
        String fname = sc.next();

        System.out.print("Enter lname: ");
        String lname = sc.next();

        System.out.print("Enter monthlySalary: $");
        double monthlySalary = sc.nextDouble();

        // Create object
        Employee1 employee1 = new Employee1(fname, lname, monthlySalary);

        // Print employee details
        System.out.println("\nEmployee details:");
        System.out.println("fname: " + employee1.getFname());
        System.out.println("lname: " + employee1.getLname());
        System.out.println("monthlySalary: $" + employee1.getMonthlySalary());

        // 10% raise
        employee1.raiseMonthlySalary();

        // Updated salary
        System.out.println("\nUpdated monthlySalary: $" + employee1.getMonthlySalary());

        sc.close();
    }
}