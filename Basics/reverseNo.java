import java.util.Scanner;

public class reverseNo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int count = 0;
        int temp = n;
        int rev = 0 ;

        while(temp != 0){
            temp = temp/10;
            count++;
        }
        int multi = (int)Math.pow(10,count-1);
        while(n != 0){
            int r = n % 10;
            r = r * multi;
            rev += r;
            n = n/10;
            multi = multi/10;
        }
        System.out.println(rev);
    }
}
