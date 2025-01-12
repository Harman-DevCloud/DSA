import java.util.Scanner;

public class FibUptoN {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int a = 0;
        int b = 1;
        int c = a+b;

        for (int i = 1; i <= n ; i++) {
            System.out.println(a);
            a = b;
            b = c;
            c = a+b;
        }

    }
}
