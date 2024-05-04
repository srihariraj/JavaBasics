import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter The number: ");
        int number = scan.nextInt();
        int R = number;
        int ans = 0; // 789
        while (number > 0) {
            int rem = number % 10; // 123/10 = 12*10 (+3)-> 10(+2) //////////// 9 8 7
            ans = ans * 10 + rem; // 9*10 + 8 = 98-> 98*10+7 = 987
            number /= 10; // 78 -> 7 -> 0
        }

        if (ans == R) {
            System.out.println("Number Palindrome");
        } else {
            System.out.println("Number is not Palindrome");
        }

        System.out.println("The reverse of number is : " + ans);
    }
}
