import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in); // Input objects
        System.out.print("Enter the numbers to Multiply\n"); // Prompting inputs
        int a = x.nextInt(); // getting A
        int b = x.nextInt(); // getting B

        int Ans = a * b; // Finding solution

        System.out.println("Answer is " + Ans); // printing solution

        x.close();

    }
}
