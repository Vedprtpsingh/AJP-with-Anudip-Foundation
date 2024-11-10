<<<<<<< HEAD
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        //input from the user
        Scanner scanner = new Scanner(System.in);
        //enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        //the user to enter the position of the bit to check (1-32)
        System.out.print("Enter the position of the bit : ");
        int n = scanner.nextInt();
        // Check if the nth bit of the number is set (1) or not (0)
        if (((num >> (n - 1)) & 1) == 1) {
            System.out.println("The " + n + "th bit is set (1).");
        } else {
            System.out.println("The " + n + "th bit is not set (0).");
        }
    }
=======
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        //input from the user
        Scanner scanner = new Scanner(System.in);
        //enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        //the user to enter the position of the bit to check (1-32)
        System.out.print("Enter the position of the bit : ");
        int n = scanner.nextInt();
        // Check if the nth bit of the number is set (1) or not (0)
        if (((num >> (n - 1)) & 1) == 1) {
            System.out.println("The " + n + "th bit is set (1).");
        } else {
            System.out.println("The " + n + "th bit is not set (0).");
        }
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}