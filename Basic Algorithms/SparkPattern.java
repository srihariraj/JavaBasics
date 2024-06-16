import java.util.Scanner;

public class SparkPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        PrintPattern(size);

        inp.close();
    }

    public static void PrintPattern(int size) {
        for (int i = 1; i <= size; i++) {// lowest to highest

            for (int k = i; k <= size; k++) { // current to highest
                System.out.print("  "); // space to move star pattern at one angle
            }

            for (int j = 1; j < i; j++) { // 1 to current
                System.out.print("*"); // print star
            }
            System.out.println();
        } // upper spark
        for (int k = 1; k <= size; k++) { // lowest to highest
            System.out.print("**");
        } // joining line
        System.out.println();
        for (int i = 1; i <= size; i++) { // lowest to highest

            for (int k = i; k < size; k++) { // current to highest
                System.out.print(" ");
            }

            for (int j = i; j < size; j++) { // current to highest
                System.out.print("*");
            }
            System.out.println();
        } // lower spark
    }
}
