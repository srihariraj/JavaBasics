import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the position: ");
        int n = S.nextInt();
        System.out.println();

        int a = 0; // 0
        int b = 1; // 1
        int c = 0;
        for (int i = 0; i < n; i++) {
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
        }
        System.out.println();

        if (n == 0) {
            System.out.println("The number in " + n + "th position is " + n);
        } else if (n == 1) {
            System.out.println("The number in " + n + "th position is " + 1);
        } else {
            a = 0;
            b = 1;
            for (int i = 2; i <= n; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            System.out.println("The number in " + n + "th position is " + a);
        }

    }
}

/*
 * give first n number of series
 * 0,1,1,2,3,5,8,13,21,34
 * 
 * give nth number of fibonacci series
 * 5th => 3
 * 6th => 8
 */