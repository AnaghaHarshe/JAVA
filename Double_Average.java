import java.util.Scanner;

public class Double_Average {

	public static void main(String[] args) {
        // Create a Scanner object to read input
		Scanner sc = new Scanner(System.in);
        // Declaration and initialization of variables to store double values
		double num1 = 0;
		double num2 = 0;

		// Check if user as entered valid value(Double) on console/terminal
        // If value is valid then store it num1 variable
        // If not invalid then display error message and terminate the program
        System.out.print("Enter 1st Double Value - ");
		if (sc.hasNextDouble() && !sc.hasNextInt()) {
			num1 = sc.nextDouble();
		} else {
			System.err.println("Error - The Value Entered is not a Double Value ");
			// To terminate the program
            System.exit(0);
		}
		
        // Check if user as entered valid value(Double) on console/terminal
        // If value is valid then store it num2 variable
        // If not invalid then display error message and terminate the program
		System.out.print("Enter 2nd Double Value - ");
		if (sc.hasNextDouble() && !sc.hasNextInt()) {
			num2 = sc.nextDouble();
		} else {
			System.err.println("Error - The Value Entered is not a Double Value ");
			// To terminate the program
            System.exit(0);
		}

        // If both values entered are valid then
        // Calculate the average of double values
		double sum = num1 + num2;
		System.out.println("Average = " + (sum/2));
     // System.out.println("Average is = " + (num1 + num2)/2);

	}

}
