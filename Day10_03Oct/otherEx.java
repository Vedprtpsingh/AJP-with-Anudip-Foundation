import java.util.ArrayList;

public class otherEx {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("rahul");
        al.add("sohan");
        al.add("nitu");
        for(String a:al){
            System.out.println(a+" ");
        }
        for(int i=al.size()-1;i>=0;i--){
            System.out.println(al.get(i));
        }
    }
}