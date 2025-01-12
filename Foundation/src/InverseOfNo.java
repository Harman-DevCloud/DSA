import java.util.Scanner;

public class InverseOfNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        int temp = n;

        while(temp != 0){
            temp /= 10;
            count++;
        }

        int rev = 0;

        for(int i = 1; i <= count; i++){
            int ld = n % 10;
            n = n / 10;

            rev = rev + i * (int)Math.pow(10, ld - 1);
        }
        System.out.println(rev);
        }

    }

