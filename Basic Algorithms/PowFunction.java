import java.util.Scanner;

public class PowFunction {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        int x, y;
        long RES = 1;

        System.out.println("Enter the value of x: ");
        x = S.nextInt();
        System.out.println("Enter the value of y: ");
        y = S.nextInt();

        while (y != 0) {
            RES = RES * x; // 1*4 -> 4*4 -> 16*4
            System.out.println(RES);
            y--;
        }

        System.out.println("The Answer x^y =" + RES);
        S.close();
    }
}
