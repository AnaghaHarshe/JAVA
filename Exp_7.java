import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Choose an operation:");
            System.out.println("1. Arithmetic Operations");
            System.out.println("2. Statistical Operations");
            System.out.println("3. Trigonometric Operations");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Arithmetic Operations
                    System.out.println("Enter two numbers: ");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();

                    System.out.println("Sum: " + (num1 + num2));
                    System.out.println("Difference: " + (num1 - num2));
                    System.out.println("Product: " + (num1 * num2));
                    System.out.println("Quotient: " + (num1 / num2));
                    break;

                case 2:
                    // Statistical Operations
                    System.out.println("Enter a set of numbers separated by spaces: ");
                    scanner.nextLine();  // Consume the newline character
                    String input = scanner.nextLine();
                    String[] numbers = input.split(" ");
                    double sum = 0;

                    for (String number : numbers) {
                        sum += Double.parseDouble(number);
                    }

                    double average = sum / numbers.length;
                    System.out.println("Average: " + average);
                    break;

                case 3:
                    // Trigonometric Operations
                    System.out.println("Enter an angle in degrees: ");
                    double angle = scanner.nextDouble();

                    double radians = Math.toRadians(angle);
                    System.out.println("Sine: " + Math.sin(radians));
                    System.out.println("Cosine: " + Math.cos(radians));
                    System.out.println("Tangent: " + Math.tan(radians));
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid operation.");
            }
        }
    }
}