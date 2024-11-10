public class exceptionEx {
    public static void fun(){
        throw new ArithmeticException();
    }
    public static void main(String[] args) {
        try{
            fun();
        }
        catch(ArithmeticException e){
            System.out.println("Error...");
        }
    }
}
