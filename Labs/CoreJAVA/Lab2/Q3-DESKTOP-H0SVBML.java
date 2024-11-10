<<<<<<< HEAD
public class Q3 {
    // static inner class called User
    static class User{
        int id; // User's ID
        String name; // User's name
        // Constructor for User class
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    // Define a static inner class called Employee that extends User
    static class Employee extends User{
        double salary; // Employee's salary
        // Constructor for Employee class
        public Employee(int id, String name, double salary) {
            // Call the User class constructor to set id and name
            super(id, name);
            this.salary = salary;
        }
        // Method to calculate the annual salary
        double calculateAnnualSalary() {
            return salary * 12;
        }
    }
    public static void main(String[] args) {
        // Create a new Employee object with id 101, name "Ved", and salary 50000
        Employee employee = new Employee(101, "Ved", 50000);
        // Calculate the annual salary of the employee
        double annualSalary = employee.calculateAnnualSalary();
        // Print
        System.out.println("Annual salary of " + employee.name + " is: " + annualSalary);
    }
=======
public class Q3 {
    // static inner class called User
    static class User{
        int id; // User's ID
        String name; // User's name
        // Constructor for User class
        public User(int id, String name) {
            this.id = id;
            this.name = name;
        }
    }
    // Define a static inner class called Employee that extends User
    static class Employee extends User{
        double salary; // Employee's salary
        // Constructor for Employee class
        public Employee(int id, String name, double salary) {
            // Call the User class constructor to set id and name
            super(id, name);
            this.salary = salary;
        }
        // Method to calculate the annual salary
        double calculateAnnualSalary() {
            return salary * 12;
        }
    }
    public static void main(String[] args) {
        // Create a new Employee object with id 101, name "Ved", and salary 50000
        Employee employee = new Employee(101, "Ved", 50000);
        // Calculate the annual salary of the employee
        double annualSalary = employee.calculateAnnualSalary();
        // Print
        System.out.println("Annual salary of " + employee.name + " is: " + annualSalary);
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}