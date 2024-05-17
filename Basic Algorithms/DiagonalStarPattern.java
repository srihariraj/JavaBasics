public class DiagonalStarPattern {
    public static void main(String[] args) {
        int size = 5; // Change the size as needed

        // Loop through rows
        for (int i = 1; i <= size; i++) {
            // Print spaces for the leading spaces
            for (int j = 1; j <= size - i; j++) {
                System.out.print(" ");
            }
            // Print stars for the current row
            for (int j = 1; j <= size; j++) {
                System.out.print(".");
            }
            // Move to the next line after printing all stars in the row
            System.out.println();
        }
    }
}