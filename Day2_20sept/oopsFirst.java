class Student{
    int id;
    String name;
    void show(){
        System.out.println("id is: "+id+" name is: "+name);
    }
}
public class oopsFirst {
    public static void main(String[] args) {
        Student s=new Student();
        //Ex1
        s.id=101;
        s.name="Amit";
        s.show();
        //Ex2
        s.id=102;
        s.name="Dev";
        s.show();
        //Ex3
        s.id=103;
        s.name="Parth";
        s.show();
    }
}