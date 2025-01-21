public class Main {
    public static void main(String[] args) {
        // Create a 2D array of 5x5
        int[][] array = new int[5][5];

        // Initialize the array with fixed values from 1 to 25
        int value = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j] = value++;
            }
        }

        // Print Output-1
        System.out.println("Output-1:");
        for (int j = 0; j < 5; j++) {
            for (int i = 0; i < 5; i++) {
                System.out.print(array[i][j] + " ");
            }
        }
        System.out.println();

        // Print Output-2
        System.out.println("Output-2:");
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(array[i][j] + " ");
                }
            } else {
                for (int j = 4; j >= 0; j--) {
                    System.out.print(array[i][j] + " ");
                }
            }
        }
        System.out.println();

        // Print Output-3
        System.out.println("Output-3:");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i][i] + " ");
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i][4 - i] + " ");
        }
        System.out.println();
    }
}