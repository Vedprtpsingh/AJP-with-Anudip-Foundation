<<<<<<< HEAD
package Lab1;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of DBMS: ");
        int dbms = sc.nextInt();
        System.out.println("Enter the Number of WT: ");
        int wt = sc.nextInt();
        System.out.println("Enter the Number of COA: ");
        int coa = sc.nextInt();
        int avg = (dbms + wt + coa) / 3;
        if (avg >= 90) {
            System.out.println("A grade");
        } else if (avg >= 70) {
            System.out.println("B grade");
        } else if (avg >= 50) {
            System.out.println("C grade");
        } else if (avg >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
=======
package Lab1;
import java.util.Scanner;

public class grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of DBMS: ");
        int dbms = sc.nextInt();
        System.out.println("Enter the Number of WT: ");
        int wt = sc.nextInt();
        System.out.println("Enter the Number of COA: ");
        int coa = sc.nextInt();
        int avg = (dbms + wt + coa) / 3;
        if (avg >= 90) {
            System.out.println("A grade");
        } else if (avg >= 70) {
            System.out.println("B grade");
        } else if (avg >= 50) {
            System.out.println("C grade");
        } else if (avg >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
