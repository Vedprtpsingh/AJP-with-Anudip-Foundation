import java.util.Stack;

public class StackEx {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("Dog");
        s.push("Cat");
        s.push("Bear");
        s.push("Horse");
        s.push("Monkey");
        System.out.println(s);
        String a=s.pop();
        System.out.println("..........Remove animal from last...........");
        System.out.println(a);
        System.out.println("......Get Top Element........");
        String b=s.peek();
        System.out.println(b);
        int p=s.search("Cat");
        System.out.println(s);
        System.out.println(p);
        System.out.println(s.isEmpty());
        System.out.println("Traversing the stack through an iterator:");
        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
    }
}
