import java.util.Scanner;

public class IsPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();

        int count = 0;
        for(int div = 2; div*div <= num; div++ ){
            if(num % div == 0){
                count++;
                break;
            }
            div++;
        }
        if(count == 0){
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is not Prime");
        }
    }
}
