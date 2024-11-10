import java.util.Scanner;
public class sumofDigit {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the nUmber: ");
        n=Math.abs(sc.nextInt());
        int sum=0;
        while (n!=0) {
            sum=sum+n%10;
            n=n/10;
        }
        System.out.println("Sum of Digit: "+sum);
        
    }
}
