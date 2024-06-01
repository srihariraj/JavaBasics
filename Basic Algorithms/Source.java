import java.util.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class Source {
    public static void main(String args[]) throws Exception {
        Scanner In = new Scanner(System.in);
        int N = In.nextInt();
        int first = 1, second = 1, third = 0;
        List<Integer> Out = new ArrayList<>();
        if (N == 1) {
            Out.add(first);
        } else if (N > 1) {
            Out.add(first);
            Out.add(second);
            for (int L = 2; L < N; L++) {
                third = first + second;
                Out.add(third);
                first = second;
                second = third;
            }
        }
        Collections.reverse(Out);
        for (int x : Out) {
            System.out.println(x);
        }

    }
}