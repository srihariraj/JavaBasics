import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.print("Enter the numbers to Add\n");
        int a = x.nextInt();
        int b = x.nextInt();

        int Ans = a + b;

        System.out.println("Answer is " + Ans);
        x.close();

    }
}
