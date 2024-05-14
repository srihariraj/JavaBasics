import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = S.nextInt();
        int originalNum = num;
        int count = 0;
        int ans = 0;

        // Count the number of digits in the number
        while (num > 0) { // 500 ->50 ->5->0 x
            num /= 10; // 50 ->5 ->0
            count++; // 1 ->2 ->3
        }

        num = originalNum; // 500

        // Calculate the sum of the digits raised to the power of the number of digits
        while (num > 0) {
            int rem = num % 10;
            ans += Math.pow(rem, count); // ans = 0+0+5^3 =125
            num /= 10;
        }
        if (ans == originalNum) {
            System.out.print("It is Armstrong number");
        } else
            System.out.print("It is not armstrong number");
    }
}

/*
 * 1 = 1^1 = 1
 * 
 * 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
 * 
 * 2 = 2^1 = 2
 * 
 * 1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407,
 * 1634, 8208, 9474, 54748, 92727, 93084,
 * 548834, 1741725, 4210818, 9800817, 9926315,
 * 24678050, 24678051, 88593477, 146511208, 472335975,
 * 534494836, 912985153, and 4679307774
 * 
 */
