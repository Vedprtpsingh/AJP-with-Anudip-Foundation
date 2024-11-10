import java.util.List;

public class CollectionEx {
    public static void main(String[] var0) {
        ArrayList al = new ArrayList();
        al.add("rahul");
        al.add("sohan");
        al.add("nitu");
        // Iterator var2 = var1.iterator();

        // while (var2.hasNext()) {
        //     String var3 = (String) var2.next();
        //     System.out.println(var3 + " ");
        // }
        // for (int var4 = var1.size() - 1; var4 >= 0; --var4) {
        //     System.out.println((String) var1.get(var4));
        // }
        List.iterator<String> it=al.List.iterator();
        while (it.hasNext()) {
            System.out.println(it.next()+" ");
        }
        System.out.println();
        while (it.hasPrevious()) {
            System.out.println(it.hasPrevious()+" ");
        }
    }
}
