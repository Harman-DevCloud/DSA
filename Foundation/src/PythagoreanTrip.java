import java.util.Scanner;

public class PythagoreanTrip {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter three integers: ");
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();

        int max = Math.max(a, Math.max(b, c));

        boolean isPythagoreanTriplet = false;
        if (max == a) {
            isPythagoreanTriplet = (a * a == b * b + c * c);
        } else if (max == b) {
            isPythagoreanTriplet = (b * b == a * a + c * c);
        } else {
            isPythagoreanTriplet = (c * c == a * a + b * b);
        }

        if (isPythagoreanTriplet) {
            System.out.println("The numbers form a Pythagorean triplet.");
        } else {
            System.out.println("The numbers do NOT form a Pythagorean triplet.");
        }
    }
}
