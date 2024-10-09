class Addition{
    //int a=5,b=6,c;
    int add(int a,int b){
        int c=a+b;
        return c;
    }
}
public class anotherEx {
    public static void main(String[] args) {
        Addition a=new Addition();
        int s=a.add(2, 5);
        System.out.println("Addition is: "+s);
    }
}