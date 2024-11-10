class Printer{
    void print (int n){
        System.out.println(n);
    }
    void print(String n){
        System.out.println(n);
    }
    void print(int a,int b){
        System.out.println(a+b);
    }
}
public class methodOverLoading {
    public static void main(String[] args) {
        Printer p=new Printer();
        p.print(6);
        p.print("ved");
        p.print(2,6);
    }
}