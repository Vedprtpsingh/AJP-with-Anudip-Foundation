import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
public class UnIntDif {

    public static void main(String[] args) {
        HashSet<Integer> a = new HashSet<>();
        a.addAll(Arrays.asList(new Integer[] {1, 4, 5, 6, 7, 9, 0}));
        HashSet<Integer> b = new HashSet<>();
        b.addAll(Arrays.asList(new Integer[] {5, 7, 2, 9, 7, 11, 10}));

        Set<Integer> union = new HashSet<>(a);
        union.addAll(b);
        System.out.println("Union: " + union);

        Set<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        System.out.println("Intersection: " + intersection);

        Set<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        System.out.println("Difference: " + difference);
    }
}