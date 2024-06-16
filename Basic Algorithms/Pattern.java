import java.util.Scanner;

public class Pattern {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int size = inp.nextInt();

        printPattern(size);

        inp.close();
    }

    public static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                System.out.println(" ");
            }
            for (int k = 1; k <= n; k++) {
                System.out.println("*");
            }
        }
    }
}
