class Addition{
    int a=5,b=6,c;
    void add(){
        c=a+b;
        System.out.println("Addition is: "+c);
    }
}
public class methodEx {
    public static void main(String[] args) {
        Addition a=new Addition();
        a.add();
    }
}
