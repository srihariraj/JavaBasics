import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int number = scan.nextInt();

        int ans = 0; // 789
        while (number > 0) {
            int rem = number % 10; // 9->8->7
            ans += rem; // 9+8+7
            number /= 10;
        }

        System.out.println("Sum Of Digits of the number is : " + ans);
    }
}
