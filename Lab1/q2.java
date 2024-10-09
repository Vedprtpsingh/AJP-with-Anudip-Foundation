import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        // input from the user
        Scanner scanner = new Scanner(System.in);
        // user to enter the first number
        System.out.print("Enter first numbers: ");
        int a = scanner.nextInt();
        //enter the second number
        System.out.print("Enter second numbers: ");
        int b = scanner.nextInt();
        //ernary operator to find the maximum between a and b
        int max = (a > b) ? a : b;
        // Print the result
        System.out.println("Maximum between " + a + " and " + b + " is " + max);
    }
}