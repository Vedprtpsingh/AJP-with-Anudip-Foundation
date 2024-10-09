package Day7_28sept;

import java.util.Scanner;

public class checkelement {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        int sum = sumofarray(a);
        System.out.println("\nThe sum of the array is: " + sum);
        evenodd(a);
    }
}
