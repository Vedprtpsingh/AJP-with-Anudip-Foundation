import java.util.LinkedList;

public class LinkedListex {
    public static void main(String[] args) {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.add(10);
        ll.add(50);
        ll.add(65);
        ll.add(34);
        ll.add(39);
        ll.add(20);
        ll.add(20);
        ll.add(15);
        ll.add(45);
        System.out.println(ll);
        System.out.println(ll.getFirst());
        System.out.println(ll.getLast());
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
        ll.clear();
        System.out.println(ll);
    }
}