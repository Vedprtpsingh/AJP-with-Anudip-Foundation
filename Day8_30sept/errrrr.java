import java.util.Scanner;

public class errrrr {
    public static void fun(int n) {
        if (n == 2) {
            throw new ArithmeticException();
        } else {
            System.out.print("The number is " + n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        try {
            fun(n);
        } catch (ArithmeticException e) {
            System.out.println("Enter any number except 2.");
        }
    }
}
