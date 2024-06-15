import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        PrintPattern(size);

        inp.close();
    }

    public static void PrintPattern(int size) {
        for (int i = 1; i <= size; i++) {// lowest to highest
            System.out.print("Loop " + i + "\t");

            for (int k = i; k < size; k++) {// current to highest
                System.out.print(" ");
            }

            for (int j = 0; j < i; j++) {// 0 to current
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
