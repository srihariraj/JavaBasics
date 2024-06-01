import java.util.Scanner;

public class PrePostProcessing {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter some number");
        int num = inp.nextInt();

        int choice = 0;
        int temp = num;
        do {
            System.out.println("Enter the option");
            System.out.println("1. Pre-Increment");
            System.out.println("2. Post-Increment");
            System.out.println("3: Pre-decrement");
            System.out.println("4: Post-decrement");
            System.out.println("0 to exit");
            choice = inp.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("current value: " + num);
                    System.out.println("during process: " + ++num);
                    System.out.println("latest value: " + num);
                    num = temp;
                    break;
                }
                case 2: {
                    System.out.println("current value: " + num);
                    System.out.println("during process: " + num++);
                    System.out.println("latest value: " + num);
                    num = temp;
                    break;
                }
                case 3: {
                    System.out.println("current value: " + num);
                    System.out.println("during process: " + --num);
                    System.out.println("latest value: " + num);
                    num = temp;
                    break;
                }
                case 4: {
                    System.out.println("current value: " + num);
                    System.out.println("during process: " + num--);
                    System.out.println("latest value: " + num);
                    num = temp;
                    break;
                }
            }
        } while (choice != 0);
        inp.close();
        long end = System.currentTimeMillis();
        System.out.println("Execution Time: " + (end - start) + "ms");

    }
}
