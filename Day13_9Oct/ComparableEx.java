import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Student implements Cloneable, Comparable<Student>{
    int sid;
    String sName;
    public Student(int sid,String sName){
        this.sid=sid;
        this.sName=sName;
    }
    @Override
    public int compareTo(Student ob){
        if(sid==ob.sid){
            return 0;
        }else if(sid>ob.sid){
            return 1;
        }else{
            return -1;
        }
    }
}
public class ComparableEx {
    public static void main(String[] args) {
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101, "Anita"));
        al.add(new Student(102, "Kajal"));
        al.add(new Student(103, "aNitu"));
        al.add(new Student(104, "Rahul"));
        Collections.sort(al);
        for(Student s:al){
            System.out.println(s.sid+" "+s.sName);
        }
    }
}