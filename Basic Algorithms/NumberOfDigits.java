import java.util.Scanner;

public class NumberOfDigits {

    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        int count = 0;
        System.out.println("Enter the number: ");
        int num = S.nextInt();

        while (num > 0) {
            num = num / 10;
            count++;
        }

        /*
         * get input
         * put in while loop with condition number is always greater than 0
         * 
         * divide the number / 10 so that we can get the number with last digit removed
         * 
         * increment count to identify removed number
         * 
         * print the count to show the result
         */

        System.out.println("The number of digits in the given number = " + count);

        S.close();
    }
}
