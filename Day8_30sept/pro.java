import java.util.Scanner;
public class pro {
    class Employee {
        private int id;
        private String name;
    
        private void getInput() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter id:");
            id = sc.nextInt();
            System.out.println("Enter name:");
            sc.nextLine();
            name = sc.nextLine();
        }
        public void showInput() {
            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            getInput();
        }
    }
    public class Main {
        public static void main(String[] args) {
            Employee employee = new Employee();
            employee.showInput();
        }
    }
}