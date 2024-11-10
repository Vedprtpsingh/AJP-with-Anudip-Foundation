<<<<<<< HEAD
public class Q1 {
    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        // Base case:
        if (n == 1 || n == 0) {
            return fact;
        }
        // calculate factorial of n-1
        fact = n * factorial(n - 1);
        return fact;
    }
    // Method to check if a number is a strong number
    public static void checkStrongNumber(int n) {
        int num = n;
        int sum = 0; // sum of factorials of digits
        while (n != 0) {
            // calculate factorial of last digit and add to sum
            sum += factorial(n % 10);
            // remove last digit
            n = n / 10;
        }
        // check if sum of factorials is equal to original number
        if (num == sum) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }
    public static void main(String[] args) {
        checkStrongNumber(145);
    }
=======
public class Q1 {
    // Method to calculate the factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        // Base case:
        if (n == 1 || n == 0) {
            return fact;
        }
        // calculate factorial of n-1
        fact = n * factorial(n - 1);
        return fact;
    }
    // Method to check if a number is a strong number
    public static void checkStrongNumber(int n) {
        int num = n;
        int sum = 0; // sum of factorials of digits
        while (n != 0) {
            // calculate factorial of last digit and add to sum
            sum += factorial(n % 10);
            // remove last digit
            n = n / 10;
        }
        // check if sum of factorials is equal to original number
        if (num == sum) {
            System.out.println(num + " is a strong number.");
        } else {
            System.out.println(num + " is not a strong number.");
        }
    }
    public static void main(String[] args) {
        checkStrongNumber(145);
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}