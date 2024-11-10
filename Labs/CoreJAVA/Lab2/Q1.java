<<<<<<< HEAD
public class Q1 {
    public static int factorial(int n){
        int fact=1;
        if(n==1 || n==0){
            return fact;
        }
        fact=n*factorial(n-1);
        return fact;
    }
    public static void checkStrongNumber(int n){
        int num=n;
        int sum=0;
        while (n!=0) {
            sum+=factorial(n%10);
            n=n/10;
        }
        if(num==sum){
            System.out.println(num+" is a strong number.");
        }else{
            System.out.println(num+" is not a strong number.");

        }
    }
    public static void main(String[] args) {
        checkStrongNumber(145);
    }
}
=======
public class Q1 {
    public static int factorial(int n){
        int fact=1;
        if(n==1 || n==0){
            return fact;
        }
        fact=n*factorial(n-1);
        return fact;
    }
    public static void checkStrongNumber(int n){
        int num=n;
        int sum=0;
        while (n!=0) {
            sum+=factorial(n%10);
            n=n/10;
        }
        if(num==sum){
            System.out.println(num+" is a strong number.");
        }else{
            System.out.println(num+" is not a strong number.");

        }
    }
    public static void main(String[] args) {
        checkStrongNumber(145);
    }
}
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
