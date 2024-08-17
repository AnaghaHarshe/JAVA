import java.util.Scanner;

class Age {
    void calculateAge() {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter current day: ");
        int dd1 = scanner.nextInt();
        System.out.print("Enter current month: ");
        int mm1 = scanner.nextInt();
        System.out.print("Enter current year: ");
        int yy1 = scanner.nextInt();

        System.out.print("Enter birth day: ");
        int dd2 = scanner.nextInt();
        System.out.print("Enter birth month: ");
        int mm2 = scanner.nextInt();
        System.out.print("Enter birth year: ");
        int yy2 = scanner.nextInt();

        int[] m_day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (isLeapYear(yy1)) {
            m_day[2] = 29;
        }
        if (mm1 < 1 || mm1 > 12 || dd1 < 1 || dd1 > m_day[mm1]) {
            System.out.println("Invalid current date");
            return;
        }
        if (mm2 < 1 || mm2 > 12 || dd2 < 1 || dd2 > m_day[mm2]) {
            System.out.println("Invalid birth date");
            return;
        }

        // Calculate age
        int ageInYears = yy1 - yy2;
        if (mm1 < mm2 || (mm1 == mm2 && dd1 < dd2)) {
            ageInYears--;
        }

        System.out.println("Age: " + ageInYears + " years");
    }

    boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Age calculator = new Age();
        calculator.calculateAge();
    }
}