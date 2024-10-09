public class findevenodd {
    public static void evenodd(int n){
        System.out.print("Even Numbers: ");
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.print("Odd Numbers: ");
        for(int i=0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    } 
    public static void main(String[] args) {
        evenodd(500);
    }
    
}
