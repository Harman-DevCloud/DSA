import java.util.Scanner;

public class RotateNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();

        int count = 0;
        int temp = n;
        while(temp != 0){
            temp /= 10;
            count++;
        }

         k = k % count;
         if (k < 0)
             { k = k + count; }

        k = ((k % count) + count) % count;

        int div = (int)Math.pow(10,k);
        int r = n % div;
        n /= div;
        int multi = (int)Math.pow(10,count-k);
        int res = r * multi + n;
        System.out.println(res);
    }
}
