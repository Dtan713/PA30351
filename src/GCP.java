import java.util.Scanner;

public class GCP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter two positive integers
        System.out.print("Enter first positive integer: ");
        int n1 = scanner.nextInt();

        System.out.print("Enter second positive integer: ");
        int n2 = scanner.nextInt();

        // Calculate GCD
        int gcd = findGCD(n1, n2);

        // Output the result
        System.out.println("The gcd of " + n1 + " and " + n2 + " is " + gcd);

        scanner.close();
    }

    // Method to calculate GCD using Euclidean algorithm
    public static int findGCD(int a, int b) {
        // Make sure a >= b
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }

        // Apply Euclidean algorithm
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }

        // Now, 'a' contains the GCD of the two numbers
        return a;
    }
}

