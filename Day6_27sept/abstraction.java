abstract class Abst{
    void slow(){
        System.out.println("No abst method......");
    }
    abstract void slow1();
}
abstract class Abst1 extends Abst{
    
}
class Abst2 extends Abst1{
    @Override
    void slow1(){
        System.out.println("Abst method..........");
    }
}
public class abstraction {
    public static void main(String[] args) {
        Abst2 ab=new Abst2();
        ab.slow();
        ab.slow1();
    }
}