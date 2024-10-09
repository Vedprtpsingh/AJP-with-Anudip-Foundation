package Lab1;
import java.util.*;
public class divisibleby7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n=sc.nextInt();
        if(n%7==0){
            System.out.println(n+" is Divisible by 7");
        }else{
            System.out.println(n+" is not Divisible by 7");
        }
    }
}
