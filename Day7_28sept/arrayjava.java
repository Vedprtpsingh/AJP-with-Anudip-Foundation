import java.util.*;

public class arrayjava {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }/*
        int sum = sumofarray(a);
        System.out.println("\nThe sum of the array is: " + sum);
        */

        /*
        System.out.println("Number of even is " + numEven);
        System.out.println("Number of odd is " + numOdd);
        System.out.println(occurrences("occurrences = "+a));*/
        //System.out.println(checkelement(a));
        //arrrev(a);
        evenElementInToAnOtherArray(a);
    }
    public static void evenElementInToAnOtherArray(int a[]) {
        int count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                count++;
            }
        }
        int newArray[] = new int[count];
        int j = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                newArray[j] = a[i];
                j++;
            }
        }
        printarr(newArray);
    }
    public static void printarr(int a[]){
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static void arrrev(int a[]){
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    public static boolean checkelement(int a[]){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element: ");
        n = sc.nextInt();
        for(int i=0;i<a.length;i++){
            if(a[i]==n){
                return true;
            }
        }
        return false;
    }
    public static int sumofarray(int a[]) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    public static void even(int a[]) {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
                count++;
            }
        }
        System.out.println();
    }

    public static void odd(int a[]) {
        int count=0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
                count++;
            }
        }
        System.out.println();
    }

    public static int occurrences(int a[]) {
        int count = 0;
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    count++;
                }
            }
        }
        return count;
    }
}