import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner X = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = X.nextInt();
        int ans = 1;

        for (; x > 0; x--) {

            ans *= x;
        }

        System.out.println("Factorial of the number is " + ans);
        X.close();
    }
}

/*
 * 10! =
 * 10*9*8*7*6*5*4*3*2*1 =
 * 3! = 3*2*1 = 6
 * 2! = 2*1 = 2
 * 1! = 1
 * += a=a+b => a+=b;
 * -=
 * /=
 * *=
 * %=
 */
