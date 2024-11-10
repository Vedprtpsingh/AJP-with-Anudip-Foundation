import java.util.Collection;
import java.util.HashMap;

public class MapEx {
    public static void main(String[] args) {
        HashMap <String,String> myDetails= new HashMap<>();
        myDetails.put("Username", "vedpratapsingh");
        myDetails.put("Password", "ved989");
        myDetails.put("Name", "Ved");
        myDetails.put("Age", "30");
        myDetails.put("City", "Delhi");
        myDetails.put("Country", "India");
        myDetails.put("Country", "USA");
        System.out.println("My Details: " + myDetails);
        System.out.println(myDetails.get("Username"));
        Collection<String>values=myDetails.values();
        System.out.println(values);
        for(String value:values){
            System.out.println(value);
        }
        Collection<String>keys=myDetails.keySet();
        System.out.println(keys);
        for(String key:keys){
            System.out.println(key);
        }
    }
}