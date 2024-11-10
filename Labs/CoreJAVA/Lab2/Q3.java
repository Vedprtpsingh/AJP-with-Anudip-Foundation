<<<<<<< HEAD
public class Q3 {
    static class User{
        int id;
        String name;
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static class Employee extends User{
        double salary;
        public Employee(int id, String name, double salary) {
            super(id, name);
            this.salary = salary;
        }
        double calculateAnnualSalary() {
            return salary * 12;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ved", 50000);
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Annual salary of " + employee.name + " is: " + annualSalary);
    }
=======
public class Q3 {
    static class User{
        int id;
        String name;
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }

    static class Employee extends User{
        double salary;
        public Employee(int id, String name, double salary) {
            super(id, name);
            this.salary = salary;
        }
        double calculateAnnualSalary() {
            return salary * 12;
        }
    }

    public static void main(String[] args) {
        Employee employee = new Employee(1, "Ved", 50000);
        double annualSalary = employee.calculateAnnualSalary();
        System.out.println("Annual salary of " + employee.name + " is: " + annualSalary);
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}