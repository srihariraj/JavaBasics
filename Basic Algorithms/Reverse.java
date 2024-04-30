import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);

        System.out.println("Enter the Texts");
        String text = S.nextLine();
        StringBuilder X = new StringBuilder();
        String Result = "";

        // for (int i = text.length() - 1; i >= 0; i--) {

        // Result = X.append(text.charAt(i)).toString();
        // }
        // X = X.append(text);
        // Result = X.reverse().toString();

        // if (Result.equals(text)) {
        // System.out.println("Palindrome");
        // } else {
        // System.out.println("Not Palindrome");
        // }///////////////////012345678//
        boolean flag = true; // MALAYALAM = 9
        for (int i = text.length() - 1; i / 2 > 0; i--) {
            if (text.charAt(i) == text.charAt(text.length() - i - 1)) {
                continue;
            } else {
                System.out.println("Not A Palindrome");
                flag = false;
                break;
            }
        }
        if (flag == true) {
            System.out.println("Palindrome");
        }

        // System.out.println(Result);
    }
}
// RACECAR
// MOM
// MALAYALAM
// ABA, ACA, CAC, CC, AA...