import java.util.Scanner;

public class PowFunction {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = num.nextInt();
        System.out.println("Enter the power");
        int p = num.nextInt();
        int result = 1;
        for (int i = 1; i <= p; i++) {
            result *= n;
        }
        System.out.println("The result is " + result);

        num.close();
    }
}