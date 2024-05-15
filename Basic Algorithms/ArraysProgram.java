import java.util.Scanner;

public class ArraysProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the array size");
        int row = input.nextInt();
        int column = input.nextInt();

        int[][] array = new int[row][column];

        System.out.println("Enter the array elements");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                array[i][j] = input.nextInt();
            }
        }
        System.out.println();

        System.out.println("foreachloop");

        for (int[] x : array) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("for loop");
        for (int k = 0; k < array.length; k++) {
            for (int u = 0; u < array[0].length; u++) {
                System.out.print(array[k][u] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
