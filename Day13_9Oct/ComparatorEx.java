import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorEx {
    class Student{
        int id;
        String name;
        public Student(int id,String name){
            this.id=id;
            this.name=name;
        }
        @Override
        public String toString(){
            return "Student [id=" + id + ", name=" + name + "]";
        }
    }
    class CompareId implements Comparator<Student>{
        @Override
        public int compare(Student o1,Student o2){
            return o1.id-o2.id;
        }
    }
    class CompareName implements Comparator<Student>{
        @Override
        public int compare (Student o1,Student o2){
            return o1.name.compareTo(o2.name);
        }
    }
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(1, "Mohit"));
        al.add(new Student(5, "Nitu"));
        al.add(new Student(3, "Rahul"));
        al.add(new Student(6, "Kavita"));
        Collections.sort(al,new CompareName());
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        Collections.sort(al,new CompareId());
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
    }
}