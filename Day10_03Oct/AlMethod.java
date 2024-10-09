import java.util.ArrayList;

public class AlMethod {
    public static void main(String[] args) {
        ArrayList<String> al=new ArrayList<>();
        al.add("ved");
        al.add("pratap");
        al.add("singh");
        System.out.println(al);
        al.add(1,"Dev");
        //System.out.println(al);
        ArrayList<String> al1=new ArrayList<>();
        al1.add("vv");
        al1.add("vvv");
        al.addAll(0,al1);
        System.out.println(al);
        //al.remove(1);
        al.removeAll(al1);
        System.out.println(al);
        /*String s="ved";
        s=s.concat("vvvv");
        System.out.println(s);*/
        al.set(2, null);
        System.out.println(al);
        System.out.println(".............methods................");
        System.out.println(al.contains("Gaurav"));
        
    }
}