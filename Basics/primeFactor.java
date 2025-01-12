import java.util.Scanner;

public class primeFactor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // Approach 1
//     for(int factor = 2; factor <= n; factor++)
//     {
//         while(n % factor == 0)
//         {
//             System.out.print(factor + " ");
//             n = n / factor;
//         }
//     }

        // Approach 2: Optimization
        for(int factor = 2; factor * factor <= n; factor++)
        {
            while(n % factor == 0)
            {
                System.out.print(factor + " ");
                n = n / factor;
            }
        }

        if(n != 1) System.out.print(n);
    }
}

