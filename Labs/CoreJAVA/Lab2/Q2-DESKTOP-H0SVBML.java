<<<<<<< HEAD
public class Q2 {
    // Method to check if a year is a leap year
    public static void checkLeapYear(int year){
        // A year is a leap year if it is divisible by 4, except for end-of-century years which must be divisible by 400
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Test the method with the year 1600, which is a leap year
        checkLeapYear(1600);
        // Test the method with the year 1900, which is not a leap year
        checkLeapYear(1900);
        
        // Test the method with the year 2004, which is a leap year
        checkLeapYear(2004);
    }
=======
public class Q2 {
    // Method to check if a year is a leap year
    public static void checkLeapYear(int year){
        // A year is a leap year if it is divisible by 4, except for end-of-century years which must be divisible by 400
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year");
        }else{
            System.out.println(year + " is not a leap year");
        }
    }
    
    // Main method
    public static void main(String[] args) {
        // Test the method with the year 1600, which is a leap year
        checkLeapYear(1600);
        // Test the method with the year 1900, which is not a leap year
        checkLeapYear(1900);
        
        // Test the method with the year 2004, which is a leap year
        checkLeapYear(2004);
    }
>>>>>>> d5fa77123764c975fd733818b5f9fbfcee1af006
}