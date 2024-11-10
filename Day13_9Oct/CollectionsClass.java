// Collections class_in java but
// collectio  is a interface
import java.util.ArrayList;
import java.util.Collections;
public class CollectionsClass {
    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        list.add(100);
        list.add(2);
        list.add(66);
        list.add(22);
        list.add(10);
        Collections.swap(list, 0, 4);   //100 is swapped by 10
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }
}

