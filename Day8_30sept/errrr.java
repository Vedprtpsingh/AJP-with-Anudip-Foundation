public class errrr {
    public static void main(String[] args) {
        int a[]={3,6,0,1,2};
        try{
            a[4]=a[0]/a[2];
        }
        catch(Exception e){
            e.printStackTrace();
        } 
        catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
