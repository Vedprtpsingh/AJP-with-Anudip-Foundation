public class oppsInheritanceEx {
    class Animal{
        String color;
        int legs;
    }
    class Cow extends Animal{

    }
    public static void main(String[] args) {
        Animal a=new Animal();
        Cow c=new Cow();
        a.color="Black";
        a.legs=4;
        System.out.println(a.color);
    }
}
