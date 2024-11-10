<<<<<<< HEAD
package Lab1;
import java.util.Scanner;

public class fatorsofAnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.print("factors of "+n+" are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
=======
package Lab1;
import java.util.Scanner;

public class fatorsofAnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        System.out.print("factors of "+n+" are: ");
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
            }
        }
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
