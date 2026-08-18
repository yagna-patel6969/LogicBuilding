import java.util.Scanner;

public class emi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter principal amount (P):");
        double P = in.nextDouble();

        System.out.println("Enter annual interest rate (R):");
        double R = in.nextDouble();

        System.out.println("Enter loan tenure in months (N):");
        int N = in.nextInt();

        double r = R / (12 * 100);

        double emi = (P * r * Math.pow(1 + r, N))
        / (Math.pow(1 + r, N) - 1);

        System.out.println("The EMI per month is: " + emi);

        in.close();
    }
}