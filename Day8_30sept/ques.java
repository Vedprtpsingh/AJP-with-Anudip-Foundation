import java.util.Scanner;

class Employee {
    int id;
    private void getInfo(){
        Scanner sc=new Scanner(System.in);
        id=sc.nextInt();
    }
    void showinfo(){
        getInfo();
        System.out.println("enployee id is "+id);
    }
}
public class ques{
    public static void main(String[] args) {
        Employee e=new Employee();
        showinfo();
    }
}

