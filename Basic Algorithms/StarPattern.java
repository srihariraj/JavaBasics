import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = S.nextInt();
        System.out.println("Enter the row");
        int i = S.nextInt();
        System.out.println("Enter the column");
        int j = S.nextInt();
        while (i > 0) {
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
            i--;
        }

        S.close();

    }
}
