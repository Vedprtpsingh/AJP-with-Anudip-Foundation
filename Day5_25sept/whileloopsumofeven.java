import java.util.Scanner;

public class whileloopsumofeven {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the nUmber: ");
        n=sc.nextInt();
        int sum=0;
        for(int i=0;i<=n;i++){
            if (i%2==0) {
                sum=sum+i;
            }
        }
        System.out.println("The sum of even numbers: "+sum);
    }
}
