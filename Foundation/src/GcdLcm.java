import java.util.Scanner;

public class GcdLcm {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();

        while(n1 % n2 != 0){
            int r = n1 % n2;
            n1 = n2;         // Update temp1 to the current value of temp2
            n2 = r;
        }
        System.out.println(n2);
        System.out.println((n1 * n2) / n2);
    }
}
