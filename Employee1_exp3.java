import java.util.Scanner;
public class Employee1{
    String fname;
    String lname;
    double monthlySalary;

    public Employee1(String fname, String lname, double monthlySalary){
        this.fname = fname;
        this.lname = lname;
        this.monthlySalary = monthlySalary;
    }

    public String getFname(){
        return fname;
    }
    public void setFname(String fname){
     this.fname = fname;
    }

    public String getlname(){
        return lname;
    }
    public void setlname(String lname){
        this.lname = lname;
    }

    public double getmonthlySalary(){
        return monthlySalary;
    }
    public void setmonthlySalary(double monthlySalary){
        this.monthlySalary = monthlySalary;
    }

    public void riseYearlySalary(){
        this.monthlySalary = this.monthlySalary * 1.10;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        //employee details
        System.out.println("Enter first name: ");
        String fname = sc.next();

        System.out.println("Enter last name: ");
        String lname = sc.next();


        System.out.println("Enter monthlySalary: $");
        double monthlySalary = sc.nextInt();
 
        //create object
        Employee1 em = new Employee1(fname, lname,  monthlySalary);

        //emp details
        System.out.println("/Employee datails:");
        System.out.println("First Name: " +em.getFname());
        System.out.println("Last name: "+ em.getlname());
        System.out.println("Monthly Salary : "+ monthlySalary);

        //10% raise
        em.riseYearlySalary();

        //updated salary
        System.out.println("\nUpdated Yearly Salary: $"+ em.getmonthlySalary());
    } 
}