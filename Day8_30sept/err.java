import java.util.Scanner;
import java.util.InputMismatchException;

public class err {
    public static void main(String[] args) {
        int a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a:");
            a = sc.nextInt();
            System.out.print("Enter b:");
            b = sc.nextInt();
            try {
                c = a / b;
                System.out.println("c=" + c);
            } catch (ArithmeticException e) {
                System.out.println("Arithmetic error: " + e);
            }
        System.out.println("End of the code");
    }
}